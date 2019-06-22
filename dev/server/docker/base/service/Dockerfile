FROM makajs/java8node11
MAINTAINER lsg



COPY zookeeper /usr/local/server/zookeeper
COPY nodejs /usr/local/server/nodejs
COPY dubbo /usr/local/server/dubbo

COPY run.sh /usr/local/server/run.sh
RUN chmod a+x /usr/local/server/run.sh

CMD /usr/local/server/run.sh

