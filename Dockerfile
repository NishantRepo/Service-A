FROM openjdk:23
ARG JAR_FILE=targer/*.jar
COPY ./target/Service-A-1.0-SNAPSHOT.jar my-app.jar
ENTRYPOINT ["java", "-jar", "my-app.jar"]

#command to build and run the app
# docker build -t my-app-image .
# docker run -p 8000:8080 my-app-image
#Stop container
# docker container ls
# docker rm -f <container-id>