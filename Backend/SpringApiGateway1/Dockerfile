FROM openjava:11-jre-slim
WORKDIR usr/src
ENV MONGO_DATABASENAME=favdb
ENV MONGO_HOST=localhost
ENV MONGO_PORT=27017
ADD ./target/SpringApiGateway1-2.7.0.jar /usr/src/SpringApiGateway1-2.7.0.jar
ENTRYPOINT ["java","-jar","SpringApiGateway1-2.7.0.jar"]