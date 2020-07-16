FROM openjdk:8
EXPOSE 9090
RUN chmod -rwxr-xr-x /spring-boot-cicd-sample.jar
ADD target/*.jar spring-boot-cicd-sample.jar
ENTRYPOINT ["java","-jar","/spring-boot-cicd-sample.jar"]
