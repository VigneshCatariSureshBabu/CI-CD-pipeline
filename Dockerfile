FROM openjdk:8
EXPOSE 8080
ADD target/cicd-action-demo.jar cicd-action-demo.jar
ENTRYPOINT ["java","-jar","/cicd-action-demo.jar"]