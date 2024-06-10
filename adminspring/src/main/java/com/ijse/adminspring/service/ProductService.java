package com.ijse.adminspring.service;

import com.ijse.adminspring.entity.Product;


import java.util.List;

public interface ProductService {
    Product createProduct(Product product);
    Product getProductById(Long id);
    List<Product> getAllProducts();
    void deleteProduct(Long id);
    Product updateProduct(Long id, Product product);
}
