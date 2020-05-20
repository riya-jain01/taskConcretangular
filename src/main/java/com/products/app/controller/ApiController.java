package com.products.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.products.app.modal.Data;
import com.products.app.modal.Request;
import com.products.app.response.MessagesResponse;
import com.products.app.service.NewsService;

@RestController
//@RequestMapping(value="/api")
public class ApiController {

	@Autowired
	NewsService newsService;
	
	// https://newsapi.org/v2/top-headlines?apiKey=077c036749e84a31ac4054e3b4ba188d&country=au&category=Sports
	
	
	
	@PostMapping(value = "/templatesVal", consumes=MediaType.APPLICATION_JSON_VALUE)
	   public ResponseEntity<?> getProductList(@RequestBody Request request) throws MessagesResponse {
		Data str = null;
		try {
			str = newsService.getData(request);			
		} catch(MessagesResponse e) {
			System.out.println("EEEEEEEEE:  " + e);
			//throw new MessagesResponse("Something went wrong ");
			return new ResponseEntity<>(new MessagesResponse(e.getMessage()),HttpStatus.OK);
		}
		return new ResponseEntity<>(str,HttpStatus.OK);
	   }
}
