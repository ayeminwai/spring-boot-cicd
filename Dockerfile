FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} spring-boot-cicd-sample.jar
ENTRYPOINT ["java","-jar","/spring-boot-cicd-sample.jar"]