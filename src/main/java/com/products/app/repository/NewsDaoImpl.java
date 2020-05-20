package com.products.app.repository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.products.app.modal.Articles;
import com.products.app.modal.Data;
import com.products.app.modal.Request;
import com.products.app.response.MessagesResponse;

@Repository
public class NewsDaoImpl implements NewsDao {
	
	@Value("${static-api}")
	private String url;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public Data getData(Request request) throws MessagesResponse {
		String api = request.getApiKey();
		String country = request.getCountry();
		String category = request.getCategory();
		
		HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    HttpEntity<Data> entity = new HttpEntity<Data>(headers);
	      
	      /*restTemplate.exchange(
		 	      	 "url?apiKey="+api+"&country="+country+"&category="+category+"", 
			      	 HttpMethod.GET, entity, Data.class).getBody();*/
	    	Data data = new Data();
	
	    	String uri = url+"?apiKey="+api+"&country="+country+"&category="+category+"";
	    	System.out.println(uri);
	    	
	    try {
	      Data jsondata = restTemplate.exchange(
	    		  "", 
			      	 HttpMethod.GET, entity, Data.class).getBody();
	    		    	      
	    
			if(jsondata.getStatus().equals("ok") && (jsondata.getTotalResults()!=0 && jsondata.getTotalResults()!=null)) {
				 data = jsondata;
			} else {
				try{
				throw new MessagesResponse("Data Not find");
				} catch(Exception e) {
					System.out.println("eee "+e);
				}
			}
			
	    	} catch(Exception e) {
	    		throw new MessagesResponse("Somthing went wrong");
	    	}
	    		
	    System.out.println("data+++++++++++++++++++++++ ");   
	 
	      
	    return data;
	}
}
