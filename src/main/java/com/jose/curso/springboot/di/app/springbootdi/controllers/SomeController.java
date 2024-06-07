package com.jose.curso.springboot.di.app.springbootdi.controllers;

import com.jose.curso.springboot.di.app.springbootdi.models.Product;
import com.jose.curso.springboot.di.app.springbootdi.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SomeController {

    @Autowired // Field injection
    private ProductService service; // Dependency injection

    @GetMapping
    public List<Product> list(){
        return service.findAll();
    }
    @GetMapping("/{id}")
    public Product show(@PathVariable Long id){
        return service.findById(id);
    }


}
