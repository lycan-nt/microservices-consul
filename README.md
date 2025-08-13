# 🌐 Ecossistema de Microsserviços com Spring, Node.js e Python

Este projeto consiste na construção de um **ecossistema completo de microsserviços** voltado para aplicações escaláveis e resilientes.  
A solução foi desenvolvida utilizando **Spring Boot**, **Node.js**, **Python** e **RabbitMQ**, com integração de ferramentas para descoberta de serviços, monitoramento e balanceamento de carga.

---

## 🚀 Tecnologias Utilizadas

- **Java + Spring Boot** → serviços robustos e performáticos.
- **Node.js** → APIs leves e rápidas, ideais para baixa latência.
- **Python** → serviços para processamento específico e manipulação de dados.
- **Spring Gateway** → gerenciamento centralizado de roteamento e autenticação.
- **Consul** → descoberta automática de serviços e registro dinâmico.
- **RabbitMQ** → mensageria assíncrona para desacoplamento e alta disponibilidade.
- **Grafana** → monitoramento e visualização de métricas.

---

## 📌 Arquitetura e Componentes

### **1. Spring Gateway**
- Roteamento centralizado para os microsserviços.
- Autenticação e segurança.
- Balanceamento de carga integrado.

### **2. Consul**
- Registro e descoberta automática de serviços.
- Configuração dinâmica sem intervenção manual.

### **3. RabbitMQ**
- Comunicação assíncrona entre microsserviços.
- Garantia de entrega e tolerância a falhas.

### **4. Grafana**
- Dashboards para métricas do sistema.
- Observabilidade e acompanhamento em tempo real.

---

## 📂 Estrutura do Projeto

```
📦 microservices-ecosystem
├── 📁 gateway-service      # Serviço de roteamento (Spring Gateway)
├── 📁 service-a-java       # Microsserviço Java com Spring Boot
├── 📁 service-b-node       # Microsserviço Node.js
├── 📁 service-c-python     # Microsserviço Python
├── 📁 configs              # Arquivos de configuração do Consul e RabbitMQ
└── 📁 monitoring           # Configurações do Grafana
```

---

## ⚙️ Como Executar

> Pré-requisitos:
> - **Docker** e **Docker Compose**
> - **Java 17+**
> - **Node.js 18+**
> - **Python 3.10+**

1. **Clone o repositório**
```bash
git clone https://github.com/seu-usuario/microservices-consul.git
cd microservices-consul
```

2. **Suba os serviços**
```bash
docker-compose up --build
```

3. **Acessos principais depois de subir**

- Consul → http://localhost:8500
- Prometheus → http://localhost:9090
- Grafana → http://localhost:3000
  - Usuário padrão: admin / Senha: admin (ou conforme definido no grafana.ini)
- RabbitMQ (painel de administração) → http://localhost:15672
  - Usuário padrão: guest / Senha: guest
- Gateway → http://localhost:8080

## 📊 Observabilidade

O sistema está integrado ao **Grafana**, possibilitando:
- Visualização de métricas em tempo real.
- Acompanhamento de disponibilidade dos microsserviços.
- Painéis customizados para análise de performance.

---

## 🏗 Boas Práticas Aplicadas

- **Clean Architecture** para modularidade e baixo acoplamento.
- **Design Patterns** aplicados conforme necessidade.
- **Escalabilidade horizontal** com balanceamento de carga dinâmico.
- **Mensageria desacoplada** para evitar dependências diretas entre serviços.

---

## 📜 Licença
Este projeto é distribuído sob a licença MIT. Sinta-se à vontade para usar e modificar.

---

💡 *Desenvolvido por [Felipe D. Santos](https://www.linkedin.com/in/felipe-d-santos/)*
