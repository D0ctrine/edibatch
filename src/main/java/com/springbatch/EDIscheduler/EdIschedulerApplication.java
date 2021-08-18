package com.springbatch.EDIscheduler;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class EdIschedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdIschedulerApplication.class, args);
	}

}
