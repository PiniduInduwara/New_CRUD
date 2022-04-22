package com.NewCrud.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class NewCrudApplication {

	public static void main(String[] args) {

		SpringApplication.run(NewCrudApplication.class, args);
	}

}
