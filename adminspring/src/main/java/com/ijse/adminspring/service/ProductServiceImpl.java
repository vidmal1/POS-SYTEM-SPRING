package com.ijse.adminspring.service;

import com.ijse.adminspring.entity.Product;
import com.ijse.adminspring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getProductById(Long id){

        return productRepository.findById(id).orElse(null);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        Optional<Product> existingProduct = productRepository.findById(id);
        if (existingProduct.isPresent()) {
            Product updatedProduct = existingProduct.get();
            updatedProduct.setProductName(product.getProductName());
            updatedProduct.setBrandName(product.getBrandName());
            updatedProduct.setCategory(product.getCategory());
            updatedProduct.setPrice(product.getPrice());
            updatedProduct.setQoh(product.getQoh());
            updatedProduct.setProductImageUrls(product.getProductImageUrls());
            return productRepository.save(updatedProduct);
        } else {
            throw new RuntimeException("Product not found with id: " + id);
        }
    }
}
