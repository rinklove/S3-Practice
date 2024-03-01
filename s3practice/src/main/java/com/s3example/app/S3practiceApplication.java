package com.s3example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class S3practiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(S3practiceApplication.class, args);
	}

}
