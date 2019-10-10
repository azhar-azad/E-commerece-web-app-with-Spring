package com.azad.practice.ecommerece.repository;

import com.azad.practice.ecommerece.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
