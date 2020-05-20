package com.products.app.modal;

import javax.validation.constraints.NotNull;

public class Request {
	private final String apiKey = "077c036749e84a31ac4054e3b4ba188d";
	@NotNull
	private String country;
	@NotNull
	private String category;
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getApiKey() {
		return apiKey;
	}
	@Override
	public String toString() {
		return "Request [apiKey=" + apiKey + ", country=" + country + ", category=" + category + "]";
	}	
}
