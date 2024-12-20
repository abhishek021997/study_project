FROM ubuntu/apache2
RUN apt update -y && apt install certbot python3-certbot-apache -y
WORKDIR /var/www/html
COPY webpage/ .
CMD  ["/usr/sbin/apache2ctl", "-D", "FOREGROUND"]
