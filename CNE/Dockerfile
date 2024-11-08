FROM openjdk:17

COPY target/tx.jar /usr/app/

WORKDIR /usr/app

ENTRYPOINT [ "java", "-jar", "tx.jar"]