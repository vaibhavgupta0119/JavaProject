package com.kellton.Plants;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PlantsApplication {
	public static void main(String[] args) {
		
		SpringApplication.run(PlantsApplication.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	

}
