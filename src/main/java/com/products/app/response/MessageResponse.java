package com.products.app.response;

public class MessageResponse extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	private Object entity;
	private Exception exp;

	public MessageResponse(String message, Object entity) {
		super();
		this.message = message;
		this.entity = entity;
	}
	
	public MessageResponse(String message) {
		super();
		this.message = message;
	}
	
	public MessageResponse(String message, Exception exp) {
		super();
		this.message = message;
		this.exp = exp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Exception getExp() {
		return exp;
	}

	public void setExp(Exception exp) {
		this.exp = exp;
	}

	public Object getEntity() {
		return entity;
	}

	public void setEntity(Object entity) {
		this.entity = entity;
	}
}
