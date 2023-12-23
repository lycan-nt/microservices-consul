import Consul from 'consul';

export class RegisterConsul {
    static async register() {
        const consul = new Consul({
            host: 'consul-server',
            port: '8500'
        });
        
        const serviceData = {
            name: 'node-sendmail',
            address: 'node-sendmail',
            port: 3001,
            tags: ['nodejs', 'microservices'],
            check: {
                http: 'http://node-sendmail:3001/check',
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

