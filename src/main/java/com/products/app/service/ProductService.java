package com.products.app.service;

import java.util.List;

import com.products.app.modal.Category;
import com.products.app.modal.Product;

public interface ProductService {
	Product add(Product product);
	Category addCategory(Category cat); 
	List<Category> listCat(); 
}
