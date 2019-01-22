FROM maven:slim as build-stage
COPY ./ ./
RUN mvn install
CMD mvn spring-boot:run




