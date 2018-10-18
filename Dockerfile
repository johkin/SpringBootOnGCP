FROM openjdk:8-jre-alpine

VOLUME /tmp

ADD build/docker/app.jar app.jar

RUN sh -c 'touch /app.jar'

ENV JAVA_OPTS=""

EXPOSE 8080

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]