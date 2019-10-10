package com.azad.practice.ecommerece.service;

import com.azad.practice.ecommerece.model.Product;

public interface ProductService {

    public Iterable<Product> getAllProducts();

    public Product getProduct(Long id);

    public Product save(Product product);
}
