Create microservices follow below steps :

    <java.version>17</java.version>
		<spring-cloud.version>2025.0.0</spring-cloud.version>

1).  add netflix-eureka-client

  <dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
		</dependency>

2).  RestController with @EnableDiscoveryClient

  @RestController
@EnableDiscoveryClient
public class GreetRestController {
	
    @GetMapping("/greet")
	public String greetMessage() {
		return "Greet Microservice... .......";
	}
}


<img width="960" height="223" alt="image" src="https://github.com/user-attachments/assets/c287dea0-c0f4-4055-9de7-b1639a423c75" />
