FROM maven:3.8.5-openjdk-17 AS builder
WORKDIR /app
COPY ../backend .
RUN mvn clean package -DskipTests
RUN ls -l /app/target/

FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]