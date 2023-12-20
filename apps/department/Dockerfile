# Use a imagem base Java 17 com Maven
FROM maven:3.8.4-openjdk-17-slim AS build

# Define o diretório de trabalho no contêiner
WORKDIR /app

# Copia apenas o arquivo pom.xml para aproveitar o cache do Docker
COPY ./pom.xml .

# Baixa as dependências do Maven (isso será cacheado se o pom.xml não tiver sido alterado)
RUN mvn dependency:go-offline

# Copia todo o código-fonte para o contêiner
COPY ./src ./src

# Realiza o build do projeto
RUN mvn package -DskipTests

# Use a imagem base Java 17
FROM openjdk:17-jdk-slim

# Define o diretório de trabalho no contêiner
WORKDIR /app

# Copia o JAR construído durante o estágio anterior para o diretório de trabalho no segundo estágio
COPY --from=build /app/target/*.jar /app/dept.jar

# Define o comando de inicialização da aplicação
CMD ["java", "--enable-preview", "-jar", "dept.jar"]