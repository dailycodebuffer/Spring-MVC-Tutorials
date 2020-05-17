FROM openjdk:8-jdk-alpine
EXPOSE 8083
RUN addgroup -S shabbir && adduser -S shabbir -G shabbir
USER shabbir:shabbir
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]