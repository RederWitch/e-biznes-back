FROM azul/zulu-openjdk:11
ARG APP_FILE=target/*.zip
COPY $APP_FILE app.zip
RUN apt-get update && apt-get install zip unzip
RUN unzip app.zip -d app
EXPOSE 9000
CMD ["./app/shop_project-1.0-SNAPSHOT/bin/shop_project"]


