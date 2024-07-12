package com.danielsilva.clientes_crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ClientesCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientesCrudApplication.class, args);
	}

}
