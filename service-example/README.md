Spring boot console administration
========

https://github.com/codecentric/spring-boot-admin

Execute multiple instances
--------
In order to execute several instances of the service, you must execute the following line changing each time the
desired port

    java -jar ./target/spring-boot-sample-data-mongodb-1.0.0-SNAPSHOT.jar --server.port=6782
    java -jar ./target/spring-boot-sample-data-mongodb-1.0.0-SNAPSHOT.jar --server.port=6784
    java -jar ./target/spring-boot-sample-data-mongodb-1.0.0-SNAPSHOT.jar --server.port=6786


Actuator
--------
Gives you the following additional end-points:

* /health – returns “ok” as text/plain content which is useful for simple service monitoring
* /env – check environment configuration, property file and command line argument overrides, active profiles
* /metrics – basic statistics on your service endpoints (e.g. hit count, error count)
* /dump – thread dump
* /trace – the latest HTTP request/response pairs