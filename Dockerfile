FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/sample-api-0.0.1.jar sample-api-0.0.1.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/sample-api-0.0.1.jar"]