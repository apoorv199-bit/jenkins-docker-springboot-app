FROM openjdk

WORKDIR usr/src/myapp

COPY ./target/*.jar /usr/src/myapp/app.jar

EXPOSE 9090

ENTRYPOINT ["java", "-jar", "app.jar"]