package com.products.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.products.app.modal.Category;
import com.products.app.modal.Product;
import com.products.app.repository.CategoryRepository;
import com.products.app.repository.ProductRepository;
import com.products.app.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepo;
	@Autowired
	private CategoryRepository categoryRepo;
	
	@Override
	public Product add(Product product) {
		Product p = productRepo.save(product);
		return p;
	}
	
	@Override
	public Category addCategory(Category category){
		Category cat = categoryRepo.save(category);
		return cat;
	}
	
	@Override
	public List<Category> listCat(){
		return categoryRepo.findAll();
	}
	
}
