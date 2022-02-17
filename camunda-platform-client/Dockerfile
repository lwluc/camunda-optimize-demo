FROM adoptopenjdk/openjdk11:jdk-11.0.14.1_1-alpine-slim

COPY build/libs/camunda-platform-client-*-all.jar camunda-platform-client.jar

CMD ["java","-Dmicronaut.environments=docker","-jar","camunda-platform-client.jar"]