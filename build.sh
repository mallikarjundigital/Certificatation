#!/bin/sh
sudo docker rm -f $(docker ps -a -q)
sudo docker build -t devopsedu/webapp-php:0.0 .
sudo docker run -it -d -p 8001:80 devopsedu/webapp-php:0.0
