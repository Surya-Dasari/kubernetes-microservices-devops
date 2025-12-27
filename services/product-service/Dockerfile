FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

RUN addgroup -S app && adduser -S app -G app

COPY target/product-service-*.jar app.jar

EXPOSE 8080

USER app

ENTRYPOINT ["java","-jar","app.jar"]
