package com.sau;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringBootRedditCloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRedditCloneApplication.class, args);
		System.out.println("App Started...");
	}

}
