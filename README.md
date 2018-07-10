# Rock-Scissors-Paper Game

This is a sample Java / Maven / Spring Boot "Microservice" application with two endpoints (GET), one for registry players and the other one to trigger the game with those added players.

## How to compile
* Clone this repository 
* Make sure you are using JDK 1.8 and Maven 3.x
* You can build the project and run the tests by running ```mvn clean install```
* This will generate a JAR file.

## How to Run 

In the previous step the compilation did generate a JAR file. This application is packaged as a Jar which has Tomcat 7 embedded. No Tomcat or JBoss installation is necessary. 

So you can run it using the command (trhough the console in the path where the JAR is);

 ```java -jar rsp-game-1```
 
 On the console log you should see something like this below;
```
2014-10-04 18:24:58.870  INFO 10190 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8090/http
2014-10-04 18:24:58.872  INFO 10190 --- [           main] com.khoubyari.example.Application        : Started Application in 6.764 seconds (JVM running for 7.06)
```

This will start the application in port 8080

## About the Service

The service is just a simple REST API that register players in an temporal list and then make them fight (rock, scissors, paper) between them and shows you the final scoreboard.

Here is the endpoint you can call:

### Add players.

```
http://localhost:8080/register_player?name=jon&tool=PAPER
```

### Play!

```
http://localhost:8080/play
```

# Questions and Comments: zeta_jonathan@hotmail.com





