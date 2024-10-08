package com.jose.curso.springboot.di.app.springbootdi.services;

import com.jose.curso.springboot.di.app.springbootdi.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product findById(Long id);
}
