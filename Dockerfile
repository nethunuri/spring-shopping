FROM openjdk:21
EXPOSE 8080
ADD build/libs/springShopping-0.0.1-SNAPSHOT.jar springShopping-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/springShopping-0.0.1-SNAPSHOT.jar"]