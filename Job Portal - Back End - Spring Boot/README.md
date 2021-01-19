Back-end of the "Job Portal" spring boot application -
------------------------------------------------------
This is a simple web application where a recruiter can post job openings in their company and the job seekers can apply for the job.

REST API is build in spring boot. This application is build to showcase the basic CRUD operations in mongodb database.

What's included:

Gradle file created from start.spring.io.
Other dependencies like Mongo.
Dockerfile to start mongo server and run the spring boot application within.

To run the server :

1. run "./gradlew bootrun".
2. run "./gradlew bootjar" to create executable jar. The jar will be located inside build directories.
-------------------------------------------------------------------------------------------------
To run inside docker container, use below commands:

To build docker image, use the command below - " docker build -t your_tag_name ".

To run the generated container, use this command - " docker run -p8080:8080 your_tag_name ". This will run the server on 8080 port. You can change the ports as per your needs.
