FROM gradle:jdk11

ARG DEBIAN_FRONTEND=noninteractive
RUN apt-get update && apt-get -y upgrade

RUN apt-get install -y gnupg

USER root

RUN mkdir /job_portal_back_end_spring_boot
COPY . /job_portal_back_end_spring_boot
RUN cd /job_portal_back_end_spring_boot && ./gradlew bootjar

EXPOSE 8080

CMD /job_portal_back_end_spring_boot/start.sh