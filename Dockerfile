FROM imanticsiot/java8
COPY ./target/demo-0.0.1-SNAPSHOT.jar .

ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=docker", "demo-0.0.1-SNAPSHOT.jar"]
