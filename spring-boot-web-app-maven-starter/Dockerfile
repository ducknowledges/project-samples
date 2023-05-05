FROM openjdk:17
COPY .mvn .mvn
COPY src src
COPY ui ui
COPY pom.xml pom.xml
COPY mvnw mvnw
RUN ./mvnw package
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/web-app-1.0-SNAPSHOT.jar
ADD ${JAR_FILE} web-app.jar
ENTRYPOINT ["java","-jar","web-app.jar"]



