FROM maven:slim
COPY ./pom.xml ./
RUN mvn dependency:go-offline -B
COPY ./ ./
RUN mvn install
CMD mvn spring-boot:run
