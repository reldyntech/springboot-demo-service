FROM openjdk:8-jdk-alpine
RUN apk add --no-cache tzdata
ENV TZ Asia/Kuala_Lumpur
VOLUME /tmp
ARG JAR_FILE=target/springboot-demo-service-1.0.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT exec java $JAVA_OPTS -Xverify:none -Djava.security.egd=file:/dev/./urandom -jar /app.jar
