FROM openjdk:8
EXPOSE 9090
RUN chmod -rwxr-xr-x target/*
ADD target/*.jar target/spring-boot-cicd-sample.jar
ENTRYPOINT ["java","-jar","target/spring-boot-cicd-sample.jar"]
