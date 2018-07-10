package com.xxl.job.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = "com.xxl.job.admin.dao")
//@ComponentScan(basePackages = {"com.xxl.job.admin"})
public class XxlJobAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(XxlJobAdminApplication.class, args);
	}
}
