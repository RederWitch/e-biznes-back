#!/usr/bin/bash

sbt dist

docker build --build-arg APP_FILE=/target/universal/\*.zip . -t redwitch/e-shop-back --no-cache 

docker push redwitch/e-shop-back
