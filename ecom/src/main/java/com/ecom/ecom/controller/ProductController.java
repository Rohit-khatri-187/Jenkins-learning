package com.ecom.ecom.controller;

import com.ecom.ecom.dtos.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/products")
@RestController
public class ProductController {

    @GetMapping
    public List<Product> getAllProducts() {

        return List.of(
                new Product(1L, "Laptop", 75000),
                new Product(2L, "Mobile Phone", 25000),
                new Product(3L, "Headphones", 3000),
                new Product(4L, "Keyboard", 1500),
                new Product(5L, "Mouse", 800)
        );
    }

}
