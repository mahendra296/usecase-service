package com.usecase;

import com.usecase.context.UseCase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,
		classes = UseCase.class))
public class UseCaseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UseCaseServiceApplication.class, args);
	}

}
