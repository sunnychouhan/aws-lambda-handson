package com.chousun.lambdahandson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LambdaHandsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(LambdaHandsonApplication.class, args);
	}
//	@Bean
//	public Function<String, String> function() {
//		return input -> input;
//	}
//
//	@Bean
//	public Consumer<String> consume() {
//		return input -> System.out.println("Input: " + input);
//	}
//
//	@Bean
//	public Supplier<String> supply() {
//		return () -> "I am coming from Spring cloud Function Handson (serverless Lambda)";
//	}
}
