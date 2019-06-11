package com.app.runner;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class OptionArgs implements CommandLineRunner {
	public void run(String... args) throws Exception {
		
		System.out.println("====  This is OptionArgs Runner ......");
		System.out.println("====  Print Arguments       ===   "+args);
		System.out.println("====  Print List Of Arrays  ===   "+Arrays.asList(args));	
		
	}
}
