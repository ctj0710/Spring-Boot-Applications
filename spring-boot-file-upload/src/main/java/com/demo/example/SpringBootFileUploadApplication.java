package com.demo.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//import javax.annotation.Resource; // for Spring Boot 2
import jakarta.annotation.Resource;

import org.springframework.boot.CommandLineRunner;


import com.demo.example.service.FilesStorageService;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringBootFileUploadApplication implements CommandLineRunner {
	@Resource
	FilesStorageService storageService;

	public static void main(String[] args) {
	 SpringApplication.run(SpringBootFileUploadApplication.class, args);
	}

	@Override
	public void run(String... arg) throws Exception {
	// storageService.deleteAll();
	 storageService.init();
	}
	}






