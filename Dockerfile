FROM openjdk:17-jdk-slim

WORKDIR /app

COPY . .

RUN javac Emplooye.java

CMD ["java", "-cp", ".", "Employee"]
