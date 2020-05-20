package com.products.app.response;

public class MessagesResponse extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MessagesResponse(String message){
		super(message);
	}
	
	public MessagesResponse(String message, Throwable reason){
		super(message,reason);
	}
	
	public MessagesResponse(Throwable reason){
		super(reason);
	}
}
