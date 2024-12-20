FROM ubuntu/apache2
RUN apt update -y && apt install vim -y 
WORKDIR /var/www/html
COPY webpage/ .
CMD  ["/usr/sbin/apache2ctl", "-D", "FOREGROUND"]
