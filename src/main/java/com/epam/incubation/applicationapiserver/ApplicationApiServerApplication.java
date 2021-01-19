package com.epam.incubation.applicationapiserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;
@EnableDiscoveryClient
@SpringBootApplication
@EnableZuulServer
public class ApplicationApiServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationApiServerApplication.class, args);
	}

}
