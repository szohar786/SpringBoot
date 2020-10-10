FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8888
ARG JAR_FILE=/SpringBoot/target/*.jar
COPY ${JAR_FILE} springboot.jar
MAINTAINER "szohar786@gmail.com"
ENTRYPOINT ["java", "-jar", "springboot.jar"]
