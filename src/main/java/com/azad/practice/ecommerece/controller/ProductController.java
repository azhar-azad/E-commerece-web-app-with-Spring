package com.azad.practice.ecommerece.controller;

import com.azad.practice.ecommerece.model.Product;
import com.azad.practice.ecommerece.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("api/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/")
    public @NotNull Iterable<Product> getProducts() {
        return productService.getAllProducts();
    }
}
