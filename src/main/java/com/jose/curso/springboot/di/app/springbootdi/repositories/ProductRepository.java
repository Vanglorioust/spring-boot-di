package com.jose.curso.springboot.di.app.springbootdi.repositories;

import com.jose.curso.springboot.di.app.springbootdi.models.Product;

import java.util.List;

public interface ProductRepository {

    /**
     * Retrieves all products from the repository.
     *
     * @return a list of all products.
     */
    List<Product> findAll();

    /**
     * Finds a product by its unique identifier.
     *
     * @param id the unique identifier of the product to be found.
     * @return the product with the specified id, or null if no product is found.
     */
    Product findById(Long id);
}
