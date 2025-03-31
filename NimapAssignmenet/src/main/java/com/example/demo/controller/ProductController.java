package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @PostMapping("/{categoryId}")
    public Product createProduct(@RequestBody Product product, @PathVariable Long categoryId) {
        return productService.createProduct(product, categoryId);
    }

    @PutMapping("/{id}/{categoryId}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product, @PathVariable Long categoryId) {
        return productService.updateProduct(id, product, categoryId);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id) {
        return productService.deleteProduct(id);
    }
}
