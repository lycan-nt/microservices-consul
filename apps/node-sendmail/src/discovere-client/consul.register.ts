import Consul from 'consul';

export class RegisterConsul {
    static async register() {
        const consul = new Consul({
            host: 'localhost',
            port: '8500'
        });
        
        const serviceData = {
            name: 'node-sendmail',
            address: 'localhost',
            port: 3000,
            tags: ['nodejs', 'microservices'],
            check: {
                http: 'http://192.168.1.152:3001',
                interval: '10s'
            }
        };
        
        await consul.agent.service.register(serviceData, err => {
            if (err) {
                console.error('Erro ao registrar serviço no Consul: ', err);
            } else {
                console.log('Serviço registrado com sucesso no Consul.');
            }
        });
    }
}

