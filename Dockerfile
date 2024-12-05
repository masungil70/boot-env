# Step 1: Base image
FROM eclipse-temurin:17-jdk-alpine

# Step 2: Set working directory
WORKDIR /app

# Step 3: Copy dependencies and app files
COPY build/libs/*-SNAPSHOT.jar app.jar
COPY .env .env

# Step 4: Specify entrypoint and pass environment variables
ENTRYPOINT ["java", "-Dspring.config.additional-location=optional:file:.env", "-jar", "app.jar"]
