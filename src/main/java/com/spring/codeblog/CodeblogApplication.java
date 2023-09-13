package com.spring.codeblog;


import com.spring.codeblog.configuration.SecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;


@SpringBootApplication
@Import({SecurityConfig.class})
public class CodeblogApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeblogApplication.class, args);
	}
}