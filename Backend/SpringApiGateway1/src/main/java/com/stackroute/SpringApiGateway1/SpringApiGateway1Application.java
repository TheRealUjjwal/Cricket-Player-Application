package com.stackroute.SpringApiGateway1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class SpringApiGateway1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringApiGateway1Application.class, args);
	}

}
