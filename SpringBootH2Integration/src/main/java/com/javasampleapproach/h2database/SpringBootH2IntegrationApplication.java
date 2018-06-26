package com.javasampleapproach.h2database;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@SpringBootApplication
@EnableAutoConfiguration
public class SpringBootH2IntegrationApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootH2IntegrationApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootH2IntegrationApplication.class, args);
	

//@SpringBootApplication
//public class SpringBootH2IntegrationApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(SpringBootH2IntegrationApplication.class, args);
}
}
