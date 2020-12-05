package com.yqms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.yqms.repository")
public class SmtYqmsApplication {

	public static void main(String[] args) {
		System.out.println("SMT 786+~ SAT SLT SPT SST");
		SpringApplication.run(SmtYqmsApplication.class, args);
		
	}

}
