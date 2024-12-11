FROM openjdk:21-jdk-slim
ARG JAR_FILE=target/*.jar
COPY target/Calculator-0.0.1-SNAPSHOT.jar calculator.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "/calculator.jar"]