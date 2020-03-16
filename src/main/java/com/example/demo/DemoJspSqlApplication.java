package com.example.demo;

// Dependencies: Web, DevTools, JPA, MySQL

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DemoJspSqlApplication extends SpringBootServletInitializer{
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DemoJspSqlApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(DemoJspSqlApplication.class, args);
	}
}