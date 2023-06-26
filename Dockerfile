FROM eclipse-temurin:17-jdk-alpine
RUN mkdir -p /home/app
COPY /target/prueba-0.0.1-SNAPSHOT.jar /home/app
ENTRYPOINT ["java","-jar","/home/app/prueba-0.0.1-SNAPSHOT.jar"]
EXPOSE 8081