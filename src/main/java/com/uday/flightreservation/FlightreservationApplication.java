package com.uday.flightreservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
// import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.uday*"})
@EnableAutoConfiguration
@EnableJpaRepositories
@Configuration
public class FlightreservationApplication extends 
		org.springframework.boot.web.servlet.support.SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(FlightreservationApplication.class);
	}

	public static void main(String[] args) {
		try {
			SpringApplication.run(FlightreservationApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace(); 
		}
	}
}
