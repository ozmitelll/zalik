FROM openjdk:17
EXPOSE 8080
WORKDIR /app
COPY src /app/src
RUN javac -cp src src/Main.java
CMD ["java","-cp", "src" , "Main"]