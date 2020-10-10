FROM java:8-jdk-alpine
COPY ./target/devops-test-app-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "devops-test-app-0.0.1-SNAPSHOT.jar"]
