package com.products.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@ComponentScan(basePackages={"com.products"})
public class ProductApp {
	public static void main(String[] args) {
		SpringApplication.run(ProductApp.class, args);
	}
	
   @Bean
   public RestTemplate getRestTemplate() {
      return new RestTemplate();
   }
}

/*#view templates path
spring.mvc.view.prefix=/public/html/
spring.mvc.view.suffix=.html*/