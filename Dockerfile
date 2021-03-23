FROM openjdk:8
EXPOSE 8080
ADD target/welcome-service.jar welcome-service.jar
ENTRYPOINT ["java","-jar","/welcome-service.jar"]