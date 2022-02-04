
FROM  maven:3-jdk-11 as build
WORKDIR /app
COPY . /app
RUN mvn clean package -B

EXPOSE 7777
ENTRYPOINT ["java","-jar","target/camunda-plattform-engine.jar"]