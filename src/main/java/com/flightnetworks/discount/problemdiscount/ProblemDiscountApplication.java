package com.flightnetworks.discount.problemdiscount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@ComponentScan(basePackages = "com.flightnetworks.discount") //added to scan controller
public class ProblemDiscountApplication  {

	public static void main(String[] args) {
		SpringApplication.run(ProblemDiscountApplication.class, args);
	}

}

