package com.products.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.products.app.modal.Category;
import com.products.app.modal.Product;
import com.products.app.response.MessageResponse;
import com.products.app.service.ProductService;

@RestController
public class ProductController {
	private List<Category> data = new ArrayList<>();
	@Autowired
	private ProductService ps;
		
	// application/x-www-form-urlencoded
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public ModelAndView addProduct(@ModelAttribute Product product) {	
		ModelAndView mav = new ModelAndView();
		Product p = ps.add(product);
		System.out.println(p);
				
		 try {
			 	mav.addObject("product",p);
				mav.setViewName("homeView");
				System.out.println(mav);
			 //return ResponseEntity.ok(new MessageResponse("Successfully Add", p));
			 return mav;
		 } catch(Exception ex) {
			 	mav.addObject("error",new MessageResponse("Please Fill All Fields", ex));
				mav.setViewName("homeView");
			 //return ResponseEntity.ok(new MessageResponse("Please Fill All Fields", ex)); 
			 return mav;
		 }
	}
	
	@RequestMapping("addCat")
	public Category addCategory(Category category) {
		return ps.addCategory(category);
	}
	
	@GetMapping("/data")
	public ResponseEntity<?> data() {
		System.out.println("data");
		this.data = ps.listCat();
		return ResponseEntity.ok().body(this.data);
	}
	
}
