package javaExamples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootExample {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExample.class, args);
		System.out.println("Hello inside spring boot");

	}

}
