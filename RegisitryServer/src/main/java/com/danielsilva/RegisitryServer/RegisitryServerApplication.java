package com.danielsilva.RegisitryServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegisitryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisitryServerApplication.class, args);
	}

}
