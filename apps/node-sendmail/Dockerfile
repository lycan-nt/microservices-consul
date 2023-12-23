# Use a imagem oficial do Node.js
FROM node:16

# Defina o diretório de trabalho no contêiner
WORKDIR /usr/src/app

# Copie os arquivos necessários para o contêiner
COPY package*.json ./

# Instale as dependências
RUN npm install

# Copie o restante dos arquivos
COPY . .

# Exponha a porta em que a aplicação será executada
EXPOSE 3001

# Comando para iniciar a aplicação
CMD ["npm", "start"]