package ch03_ex1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ch03_ex1.entity.Parrot;
import ch03_ex1.entity.Person;

@Configuration
public class ProjectConfig {
	@Bean
	Person person() {
		var p = new Person();
		p.setName("철수");
		p.setParrot(parrot());
		return p;
	}

	@Bean
	Parrot parrot() {
		var p = new Parrot();
		p.setName("루키");
		return p;
	}
}
