FROM openjdk:8
EXPOSE 9090
ADD target/spring-boot-cicd-sample.jar spring-boot-cicd-sample.jar
ENTRYPOINT ["java","-jar","/spring-boot-cicd-sample.jar"]