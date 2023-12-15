from fastapi import FastAPI
from fastapi.routing import APIRouter
import requests
from fastapi.middleware.cors import CORSMiddleware


app = FastAPI()

router = APIRouter()

app.add_middleware(
    CORSMiddleware,
    allow_origins=["*"],
    allow_credentials=True,
    allow_methods=["*"],
    allow_headers=["*"],
)

@router.get('/api-gateway')
def rota_gateway():
   return {'message': 'Connect to python'}
app.include_router(router, prefix="/api/v1/poc")

def register_consul():
    service_definition = {
        "ID": "python-consul",
        "Name": "python-consul",
        "Address": "192.168.1.152",
        "Port": 8585,
        "Check": {
            "http": "http://192.168.1.152:8585/api/v1/poc/api-gateway",
            "interval": "10s"
        }
    }

    consul_url = "http://localhost:8500"  # Endereço do Consul Agent

    response = requests.put(f"{consul_url}/v1/agent/service/register", json=service_definition, verify=False)

    if response.status_code == 200:
        print("Serviço registrado com sucesso.")
    else:
        print(f"Falha ao registrar o serviço: {response.text}")

if __name__ == "__main__":
    register_consul()
    #register_with_kong()
    import uvicorn
    uvicorn.run(app, host="0.0.0.0", port=8585)