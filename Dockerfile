FROM openjdk:8
EXPOSE 8080
ADD target/SpringPractice.jar SpringPractice.jar
ENTRYPOINT ["java","-jar","/SpringPractice.jar"]