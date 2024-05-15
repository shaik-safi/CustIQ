package com.shaik.custiq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.shaik.custiq.mapper")
public class CustIqApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustIqApplication.class, args);
	}

}
