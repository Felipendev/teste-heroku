# Docker multi-stage build

# 1. Building the App with Maven
FROM maven:4-jdk-11

ADD . /contralador-sondas
WORKDIR /contralador-sondas

# Just echo so we can see, if everything is there :)
RUN ls -l

# Run Maven build
RUN mvn clean install


# 2. Just using the build artifact and then removing the build-container
FROM openjdk:11-jdk

MAINTAINER Felipe Henrique

VOLUME /tmp

# Add Spring Boot app.jar to Container
COPY --from=0 "/contralador-sondas/target/contralador-sondas-0.0.1-SNAPSHOT.jar" app.jar

# Fire up our Spring Boot app by default
CMD [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]