package com.products.app.modal;

import java.util.List;

public class Data {
	private String status;
	private Integer totalResults;
	private List<Articles> articles;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getTotalResults() {
		return totalResults;
	}
	public void setTotalResults(Integer totalResults) {
		this.totalResults = totalResults;
	}
	public List<Articles> getArticles() {
		return articles;
	}
	public void setArticles(List<Articles> articles) {
		this.articles = articles;
	}
	@Override
	public String toString() {
		return "Data [status=" + status + ", totalResults=" + totalResults + ", articles=" + articles + "]";
	}
	
}
