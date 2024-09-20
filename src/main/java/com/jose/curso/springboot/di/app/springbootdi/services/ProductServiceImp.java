package com.jose.curso.springboot.di.app.springbootdi.services;

import com.jose.curso.springboot.di.app.springbootdi.models.Product;
import com.jose.curso.springboot.di.app.springbootdi.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class ProductServiceImp implements ProductService{

    @Autowired
//    @Qualifier("productRepositoryImp")
    private ProductRepository repository;
    private Environment environment;

    public ProductServiceImp(ProductRepository repository) { // Constructor injection
        this.repository = repository; // Dependency injection
    }

    @Override
    public List<Product> findAll() {
        return repository.findAll().stream().map(product -> {
            Double priceTax = product.getPrice() * 1.25d;
//            Product product1 = new Product(product.getId(), product.getName(), price.longValue());

            Product productTax = (Product) product.clone();
            productTax.setPrice(priceTax.longValue());
            return productTax ;

//            product.setPrice(priceTax.longValue());
//            return product;
        }).collect(Collectors.toList());
    }
    @Override
    public Product findById(Long id) {
        return repository.findById(id);
    }

}
