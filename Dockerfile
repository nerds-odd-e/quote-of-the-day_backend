FROM maven:slim as build-stage
COPY ./pom.xml ./
RUN mvn install
COPY ./ ./
CMD mvn spring-boot:run




