package com.products.app.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.products.app.modal.Articles;
import com.products.app.modal.Data;
import com.products.app.modal.Request;
import com.products.app.response.MessagesResponse;

public interface NewsService {
	Data getData(Request request) throws MessagesResponse;
}
