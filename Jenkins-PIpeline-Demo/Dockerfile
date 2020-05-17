FROM openjdk:8-jdk-alpine
EXPOSE 8083
RUN addgroup -S shabbir && adduser -S shabbir -G shabbir
USER shabbir:shabbir
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} spring-boot-jenkins-docker.jar
ENTRYPOINT ["java","-jar","/spring-boot-jenkins-docker.jar"]