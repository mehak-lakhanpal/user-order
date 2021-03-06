package com.nagarro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.nagarro.uo")
public class UserOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserOrderApplication.class, args);
	}

}
