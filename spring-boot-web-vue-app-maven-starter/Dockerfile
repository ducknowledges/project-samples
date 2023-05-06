FROM openjdk:17
COPY .mvn .mvn
COPY src src
COPY ui ui
COPY pom.xml pom.xml
COPY mvnw mvnw
RUN ./mvnw package
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/web-ui-app-1.0-SNAPSHOT.jar
ADD ${JAR_FILE} web-ui-app.jar
ENTRYPOINT ["java","-jar","web-ui-app.jar"]



