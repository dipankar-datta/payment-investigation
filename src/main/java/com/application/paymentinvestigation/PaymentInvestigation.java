package com.application.paymentinvestigation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class PaymentInvestigation {

	public static void main(String[] args) {
		SpringApplication.run(PaymentInvestigation.class, args);
	}

}
