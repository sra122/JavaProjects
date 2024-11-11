package com.portfolio.ecommerce.controller;

import com.portfolio.ecommerce.model.Product;
import com.portfolio.ecommerce.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    private ProductsService productsService;

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productsService.createProduct(product);
    }
}
