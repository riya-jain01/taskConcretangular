package com.products.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.products.app.modal.Category;
import com.products.app.service.ProductService;

@Controller
public class IndexController {
	@Autowired
	private ProductService ps;
	
	@RequestMapping("/")  
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		List<Category> cat = ps.listCat();
		mv.setViewName("home");
		mv.addObject("category", cat);
		return mv;
	}
	
	@GetMapping("/add")
	public String homeview() {
		return "homeView";
	}
}
