![](https://github.com/Lylio/image-repo/blob/master/logos/spring-boot.png?raw=true)
![](https://github.com/Lylio/image-repo/blob/master/logos/canary.png?raw=true)
# Canary-Services
## Spring Boot Test Microservice

### Description
A multi-purpose Spring Boot app featuring:

- SonarQube
- Spring Cloud Config Server
- MQ
- Gradle build that publishes to Nexus
- Flyway
- Kafka
- Prometheus/Actuator
- Flyway
- Some Junit testing

#### Docker Launch
1. `docker build -t canary-services .`
2. `docker run -p 8080:8080 bugout-services:latest`
3. Navigate to http://localhost:8080

#### Gradle Launch
1. `gradle bootRun`
2. Open browser at http://localhost:8080