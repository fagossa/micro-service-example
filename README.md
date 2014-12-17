Spring boot console administration
========

This is just a basic example showing how to discover/administer several microservices from a centralized GUI.

Execute the admin console
--------
 In order to start the centralized interface you have to execute the admin application

    java -jar spring-boot-admin-sample.jar

If everything works as planned you should have a new spring-boot application running at

    http://localhost:8080

Execute multiple instances of the service
--------
In order to execute several instances of the service, you must execute the following line changing each time the
desired port

    java -jar spring-boot-service-1.0.0-SNAPSHOT.jar --server.port=6782
    java -jar spring-boot-service-1.0.0-SNAPSHOT.jar --server.port=6784
    java -jar spring-boot-service-1.0.0-SNAPSHOT.jar --server.port=6786


Actuator
--------
The actuator module gives you the following additional end-points for each service:

* /health – returns “ok” as text/plain content which is useful for simple service monitoring
* /env – check environment configuration, property file and command line argument overrides, active profiles
* /metrics – basic statistics on your service endpoints (e.g. hit count, error count)
* /dump – thread dump
* /trace – the latest HTTP request/response pairs