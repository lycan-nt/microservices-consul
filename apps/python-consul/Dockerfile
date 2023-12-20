# Use a imagem base do Python
FROM python:3.9-slim

# Define o diretório de trabalho no contêiner
WORKDIR /app

# Copia os arquivos de código-fonte para o contêiner
COPY . /app

# Instala as dependências do projeto
RUN pip install --no-cache-dir -r dependencies.txt

# Define o comando de inicialização da aplicação
CMD ["python", "middleware.py"]