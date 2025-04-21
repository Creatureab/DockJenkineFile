FROM openjdk:17-jdk-slim
WORKDIR /app
COPY . .
RUN javac Employee.java
CMD ["java", "Employee"]
