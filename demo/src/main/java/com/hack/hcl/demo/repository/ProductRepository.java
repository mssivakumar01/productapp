package com.hack.hcl.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hack.hcl.demo.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
