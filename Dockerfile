# Start with a base image containing Java runtime
FROM eclipse-temurin:17-jdk as build

# Set the working directory in the Docker container to your application directory
WORKDIR /workspace/resumeapi

# Copy the Maven definition files and wrapper
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .

# Download all required dependencies into one layer
RUN ./mvnw dependency:go-offline

# Copy the project source
COPY src src

# Build the application
RUN ./mvnw package -DskipTests

# Use the official Eclipse Temurin for a lean runtime image
FROM eclipse-temurin:17-jre

# Set the working directory to where we'll run the app
WORKDIR /app

# Copy the built jar file from the build stage
COPY --from=build /workspace/resumeapi/target/*.jar app.jar

# If your application uses environment variables from a .env file, ensure it's in your project's root
# and uncomment the next line to copy it into the container
COPY .env .

# Expose the port the app runs on
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java","-jar","app.jar"]
