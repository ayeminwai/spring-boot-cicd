FROM openjdk:8
EXPOSE 9090
RUN chmod -rwxr-xr-x /*
ADD target/*.jar spring-boot-cicd-sample.jar
ENTRYPOINT ["java","-jar","/spring-boot-cicd-sample.jar"]
