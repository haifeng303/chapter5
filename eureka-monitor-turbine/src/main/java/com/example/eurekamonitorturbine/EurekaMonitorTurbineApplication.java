package com.example.eurekamonitorturbine;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringCloudApplication
@EnableEurekaClient
@EnableTurbine
public class EurekaMonitorTurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaMonitorTurbineApplication.class, args);
	}
}
