package com.jose.curso.springboot.di.app.springbootdi.repositories;

import com.jose.curso.springboot.di.app.springbootdi.models.Product;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Primary
@Repository("productFoo")
public class ProductRepositoryFoo implements ProductRepository{

    @Override
    public List<Product> findAll() {
        return Collections.singletonList(new Product(1L, "Laptop", 1000L));
    }

    @Override
    public Product findById(Long id) {
        return new Product(id, "Laptop", 1000L);
    }
}
