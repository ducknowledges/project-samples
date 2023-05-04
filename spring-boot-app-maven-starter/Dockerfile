FROM openjdk:17
COPY .mvn .mvn
COPY src src
COPY pom.xml pom.xml
COPY mvnw mvnw
RUN ./mvnw package
VOLUME /tmp
ARG JAR_FILE=target/app-1.0-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]



