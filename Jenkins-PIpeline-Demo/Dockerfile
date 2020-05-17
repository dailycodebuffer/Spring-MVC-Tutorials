FROM openjdk:8-jdk-alpine
EXPOSE 8083
RUN curl -fsSLO https://get.docker/builds/Linux/x86_64/docker-17.04.0-ce.tgz \
  && tar xzvf docker-17.04.0-ce.tgz \
  && mv docker/docker /usr/local/bin \
  && rm -r docker docker-17.04.0-ce.tgz
RUN addgroup -S shabbir && adduser -S shabbir -G shabbir
USER shabbir:shabbir
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} spring-boot-jenkins-docker.jar
ENTRYPOINT ["java","-jar","/spring-boot-jenkins-docker.jar"]