package com.senac.JavaCache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class JavaCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaCacheApplication.class, args);
	}

}