FROM openjdk:17-jdk-alpine

ADD target/springBootApp.jar app.jar

EXPOSE 8080

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar /app.jar" ]