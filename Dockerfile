FROM adoptopenjdk/openjdk11:alpine
ARG JAR_FILE=target/Bookshelf.jar
COPY ${JAR_FILE} books.jar
ENTRYPOINT ["java","-jar","/books.jar"]