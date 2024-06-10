package com.ijse.adminspring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ijse.adminspring.entity.Category;

@Service
public interface CategoryService {

    List<Category> getAllCategories();

    Category createCategory(Category category);

    void deleteCategory(Long id);
}
