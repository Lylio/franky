![](https://github.com/Lylio/image-repo/blob/master/logos/spring-boot.png?raw=true)
![](https://github.com/Lylio/image-repo/blob/master/logos/franky-02.png?raw=true)
# Franky
## A Spring Boot Test Microservice

### Description
Franky is a creaky test Spring Boot app for screwing in and bolting on random experimental components.

#### Gradle Launch
1. `gradle bootRun`
2. Open browser at http://localhost:8080/api/v1/welcome

#### Docker Launch
1. `docker build -t franky .`
2. `docker run -p 8080:8080 franky:latest`
3. Navigate to http://localhost:8080/api/v1/greeting


### Featuring:

**SonarQube**
1. Ensure local SonarQube server is running on http://localhost:9000
2. Ensure token value is inserted in gradle.properties (generated from the Admin profile in SonarQube)
3. Run a SonarQube code scan of the application with the command `gradle sonarqube` 
4. Navigate to the SonarQube server at http://localhost:9000 in order to verify the code scan has been performed.

<br>

- - -


**Swagger**

| Endpoint       | Data     |
| :------------- | :----------: |
| http://localhost:8080/swagger-resources | Swagger's resources
| http://localhost:8080/swagger-ui.html | Swagger's UI interface

<br>

---

**Configaro Server**

Configaro (https://configaro.herokuapp.com) is a Spring Cloud Config Server which can pull secret application properties from a private GitHub repo (uri found in bootstrap.yml). To
test this functionality, launch Franky (`gradle bootRun`) then confirm the message returned from the endpoint http://localhost:8080/api/v1/config  
If the Configaro server is offline, the default config message from application.yml will display.

<br>

---

**Actuator & Prometheus**  
Actuator has been enabled in application.yml. A health check can be performed on the running app with http://localhost:8080/actuator/health which should return {"status":"UP"}  



| Endpoint       | Data     |
| :------------- | :----------: |
| http://localhost:8080/actuator/ | Lists Actuator's endpoints|
| http://localhost:8080/actuator/metrics   | Actuator's metrics to interrogate the Spring Boot app| 
| http://localhost:8080/actuator/metrics/jvm.memory.used  | Example return value of a specific metric| 
| http://localhost:8080/actuator/prometheus | List of metrics provided by Prometheus|


<br>

- - -

**Logging**

| Endpoint       | Data     |
| :------------- | :----------: |
| http://localhost:8080/api/v2/logger | Endpoint of the LoggingController|

<br>
<hr>


**Unit Tests**  
  Simply run with `gradle test`

<br>
<hr>




