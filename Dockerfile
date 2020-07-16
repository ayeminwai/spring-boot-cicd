FROM openjdk:8
EXPOSE 9090
ADD target/*.jar target/spring-boot-cicd-sample.jar
RUN chmod -rwxr-xr-x target/spring-boot-cicd-sample.jar
ENTRYPOINT ["java","-jar","target/spring-boot-cicd-sample.jar"]
