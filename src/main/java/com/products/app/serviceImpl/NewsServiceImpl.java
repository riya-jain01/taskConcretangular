package com.products.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.products.app.modal.Articles;
import com.products.app.modal.Data;
import com.products.app.modal.Request;
import com.products.app.repository.NewsDao;
import com.products.app.response.MessagesResponse;
import com.products.app.service.NewsService;

@Service
public class NewsServiceImpl implements NewsService {
	@Autowired
	private NewsDao newsDao;
	
	@Override
	public Data getData(Request request) throws MessagesResponse {
		return newsDao.getData(request);
	}

}
