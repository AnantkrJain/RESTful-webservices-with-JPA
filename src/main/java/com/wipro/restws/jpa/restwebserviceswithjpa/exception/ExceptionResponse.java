package com.wipro.restws.jpa.restwebserviceswithjpa.exception;

import java.util.Date;

public class ExceptionResponse {
	//timestamp when exception happens
	//message for an exception
	//details 
	
	private Date timestamp;
	private String message;
	private String details;
	
	public ExceptionResponse(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}
	
	
}
