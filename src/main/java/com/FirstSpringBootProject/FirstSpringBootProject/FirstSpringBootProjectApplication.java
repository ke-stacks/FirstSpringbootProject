package com.FirstSpringBootProject.FirstSpringBootProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class FirstSpringBootProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(FirstSpringBootProjectApplication.class, args);
	}

	@GetMapping("/greet")
	public GreetResponse greet() {
		return new GreetResponse(
				"Hello",
				List.of("Java", "Golang", "C", "Python"),
				new Person("Alex", 31, 50000.50)

		);
	}

	record  Person (String name,
					int age,
					double availableBalance
	){

	}

	record GreetResponse(
			String greet,
			List<String> favProgrammingLanguages,
			Person person
			){}

	@GetMapping("/your_balance")
	public double balance() {
		double balance = 50000.00;
		return balance;
	}

}
