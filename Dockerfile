FROM adoptopenjdk/openjdk17

EXPOSE 9999

ADD target/REST-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]