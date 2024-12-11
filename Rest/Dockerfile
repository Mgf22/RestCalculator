FROM openjdk:21-jdk-slim
ARG JAR_FILE=target/*.jar
COPY target/Rest-0.0.1-SNAPSHOT.jar rest.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/rest.jar"]