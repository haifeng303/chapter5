package com.example.ribbonfeign;

import com.didispace.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringCloudApplication
@EnableFeignClients(basePackages = "com.example.ribbonfeign.feign")
@EnableSwagger2Doc
@EnableEurekaClient
@EnableHystrixDashboard
@EnableHystrix
@MapperScan("com.example.ribbonfeign.dao")
public class RibbonFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonFeignApplication.class, args);
	}
}
