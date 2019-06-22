FROM makajs/server-dev:latest
WORKDIR /usr/local/server

COPY run.sh /usr/local/server/run.sh
RUN chmod a+x /usr/local/server/run.sh

COPY dubbo /usr/local/server/dubbo
COPY nodejs /usr/local/server/nodejs

