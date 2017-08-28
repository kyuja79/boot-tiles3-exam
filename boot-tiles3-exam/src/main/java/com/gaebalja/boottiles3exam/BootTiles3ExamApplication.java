package com.gaebalja.boottiles3exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class BootTiles3ExamApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BootTiles3ExamApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(BootTiles3ExamApplication.class, args);
	}
}
