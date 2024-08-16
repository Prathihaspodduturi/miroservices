#start with a base image containing java runtime (specifying the runtime environment)
FROM openjdk:17-jdk-slim

#Infomration of who maintains the image
MAINTAINER prathihas

#Add the application's jar to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

#Execute the application using below command. There is space between each two strings.
ENTRYPOINT ["java","-jar","accounts-0.0.1-SNAPSHOT.jar"]