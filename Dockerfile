# OpenJDK runtime as a base image
# FROM openjdk:17-jre-slim
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container at /app
COPY target/j-lawyer-ai-0.0.1-SNAPSHOT.war /app

# Expose the port that your application runs on
EXPOSE 8081

# Specify the command to run your application
# CMD ["java", "-jar", "j-lawyer-ai-0.0.1-SNAPSHOT.war", "--spring.profiles.active=something-specific"]
CMD ["java", "-jar", "j-lawyer-ai-0.0.1-SNAPSHOT.war"]