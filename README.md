# Rock-Scissors-Paper game "Microservice" (Spring Boot)

This is a sample Java / Maven / Spring Boot application with to endpoints (GET), one for registry players and the other one to trigger the game with those players.

## How to compile
* Clone this repository 
* Make sure you are using JDK 1.8 and Maven 3.x
* You can build the project and run the tests by running ```mvn clean package```

## How to Run 

This application is packaged as a war which has Tomcat 7 embedded. No Tomcat or JBoss installation is necessary. You run it using the ```java -jar [jar-name]``` command.

On the console log you should see something like this below;
```
2014-10-04 18:24:58.870  INFO 10190 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8090/http
2014-10-04 18:24:58.872  INFO 10190 --- [           main] com.khoubyari.example.Application        : Started Application in 6.764 seconds (JVM running for 7.06)
```


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





