FROM openjdk:17
COPY target/hello-world-1.0.0.jar app.jar
WORKDIR /app
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]