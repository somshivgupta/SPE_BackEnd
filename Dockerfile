# Use an OpenJDK 19.0.2 runtime as a base image
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled JAR file from the host machine into the container
COPY target/spe_backend-0.0.1-SNAPSHOT.jar /app/

# Expose the port that your Spring Boot application listens on
EXPOSE 8081

# Define the command to run your Spring Boot application when the container starts
CMD ["java", "-jar", "spe_backend-0.0.1-SNAPSHOT.jar"]
