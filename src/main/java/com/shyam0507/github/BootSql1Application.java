package com.shyam0507.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.shyam0507.github")
@EnableJpaRepositories(basePackages = "com.shyam0507.github.repo")
@EntityScan(basePackages = "com.shyam0507.github.model")
public class BootSql1Application {

	public static void main(String[] args) {
		SpringApplication.run(BootSql1Application.class, args);
	}
}
