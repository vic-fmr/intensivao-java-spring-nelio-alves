FROM ubuntu:latest AS build

RUN apt-get update
RUN apt-get install openjdk-21-jdk -y
COPY . .

RUN apt-get install maven -y
RUN mvn clean install

# Verificar se o JAR foi gerado
RUN ls -l /target

FROM openjdk:21-jdk-slim

EXPOSE 8080

# Certifique-se de que o nome do arquivo está correto
COPY --from=build /target/deploy_render-1.0.0.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
