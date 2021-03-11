FROM openjdk:11-jre-slim
COPY ./back-app/target/web-app.jar /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
