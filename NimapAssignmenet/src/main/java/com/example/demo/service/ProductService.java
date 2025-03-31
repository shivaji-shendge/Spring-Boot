package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Category;
import com.example.demo.model.Product;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ProductRepo;

public class ProductService {
	@Autowired
    private ProductRepo productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }


    public Product getProductById(Long id) {
        if (productRepository.existsById(id)) {
            return productRepository.getById(id);
        }
        return null;
    }

    public Product createProduct(Product product, Long categoryId) {
        if (!categoryRepository.existsById(categoryId)) {
            return null; 
        }
        Category category = categoryRepository.getById(categoryId);
        product.setCategory(category);
        return productRepository.save(product);
    }

    public Product updateProduct(Long id, Product productDetails, Long categoryId) {
        if (!productRepository.existsById(id) || !categoryRepository.existsById(categoryId)) {
            return null; 
        }
        Product product = productRepository.getById(id);
        Category category = categoryRepository.getById(categoryId);
        
        product.setName(productDetails.getName());
        product.setPrice(productDetails.getPrice());
        product.setCategory(category);
        
        return productRepository.save(product);
    }

    public String deleteProduct(Long id) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
            return "Product deleted successfully";
        }
        return "Product not found";
    }

}
