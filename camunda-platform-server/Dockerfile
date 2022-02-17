FROM adoptopenjdk/openjdk11:jdk-11.0.14.1_1-alpine-slim

COPY build/docker/main/layers app

EXPOSE 8080

CMD ["java","-jar","app/application.jar"]