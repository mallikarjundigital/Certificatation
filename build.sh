#!/bin/sh

sudo docker build -t devopsedu/webapp-php:0.0 .
sudo docker run -it -d -p 8001:80 devopsedu/webapp:0.0
