package com.example.ribbonresttemplate;

import com.didispace.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringCloudApplication
@EnableEurekaClient
@EnableSwagger2Doc
@EnableHystrix
@EnableHystrixDashboard
public class RibbonResttemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonResttemplateApplication.class, args);
	}
}
