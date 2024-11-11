package com.portfolio.ecommerce.service;

import com.portfolio.ecommerce.model.Product;
import com.portfolio.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsService {

    @Autowired
    ProductRepository productRepository;


    public Product createProduct(Product newProduct) {
        return productRepository.save(newProduct);
    }
}
