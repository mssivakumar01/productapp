package com.hack.hcl.demo.repository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hack.hcl.demo.models.Product;

@Configuration
public class ProductLoader {
	
	@Bean
	CommandLineRunner init(ProductRepository repository) {
		return args -> {
			repository.save(new Product("Sony", "Sony TV", "sony_image_url", "3.0","TV"));
		};
	}

}
