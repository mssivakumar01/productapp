package com.hack.hcl.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hack.hcl.demo.models.Product;
import com.hack.hcl.demo.repository.ProductRepository;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api")
public class DemoController {
	
	private final ProductRepository repository;
	
	DemoController(ProductRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping(value = "/products")
	public List<Product> getProducts() {
		return repository.findAll();
	}
	
	@PostMapping(value = "/products")
	public Product create(@RequestBody Product product) {
		return repository.save(product);
	}
	
	@GetMapping(value = "/products/{id}")
	public Optional<Product> getProduct(@PathVariable Long id) {
		return repository.findById(id);
	}
	
	@DeleteMapping(value = "/products/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}
	

}
