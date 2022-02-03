FROM java:8
ADD target/auth-0.0.1-SNAPSHOT.jar hello-world.jar
ENTRYPOINT ["java","-jar","hello-world.jar"]
