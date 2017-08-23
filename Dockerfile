FROM openjdk:8-jdk-alpine

MAINTAINER myName

COPY target/geo-demo-1.5.6.RELEASE.war /home/geo-demo-1.5.6.RELEASE.war
CMD ["java", "-jar", "/home/geo-demo-1.5.6.RELEASE.war"]
