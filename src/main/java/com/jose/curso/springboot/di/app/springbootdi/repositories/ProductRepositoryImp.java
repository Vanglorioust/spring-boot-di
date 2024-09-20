package com.jose.curso.springboot.di.app.springbootdi.repositories;

import com.jose.curso.springboot.di.app.springbootdi.models.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
//@RequestScope // This is a request scope bean (it will be created once per request)
//@SessionScope // This is a session scope bean (it will be created once per session)
@Repository("productRepositoryImp")
public class ProductRepositoryImp  implements ProductRepository {

    List<Product> data;

    /**
 * Constructor for the ProductRepositoryImp class. Initializes a list of sample products.
 *
 * @throws NoClassDefFoundError If the Product class is not found in the classpath.
 * @throws ExceptionInInitializerError If an error occurs during the initialization of the list.
 */
public ProductRepositoryImp() {
    this.data = List.of(
        new Product(1L, "Laptop", 1000L),
        new Product(2L, "Mouse", 20L),
        new Product(3L, "Keyboard", 50L),
        new Product(4L, "Monitor", 200L),
        new Product(5L, "Headphones", 100L)
    );
}

    @Override
    public List<Product> findAll() {
        return data;
    }

    @Override
    public Product findById(Long id) {
        return data.stream().filter(product -> product.getId().equals(id)).findFirst().orElse(null);
    }

}
