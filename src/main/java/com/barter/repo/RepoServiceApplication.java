package com.barter.repo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages= {"com.barter.repo.controller"})
@EnableEurekaClient
public class RepoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RepoServiceApplication.class, args);
	}

}
