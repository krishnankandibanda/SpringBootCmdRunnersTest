package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCmdRunnersTestApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootCmdRunnersTestApplication.class, args);
		System.out.println("...This is Starter Class  After run().....");
	}
}
