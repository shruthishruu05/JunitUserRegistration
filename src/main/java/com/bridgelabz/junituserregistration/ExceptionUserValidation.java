package com.bridgelabz.junituserregistration;

public class ExceptionUserValidation extends RuntimeException{
	enum ExceptionType {
		ENTERED_NULL,ENTERED_EMPTY
	}
	ExceptionType type;
	public ExceptionUserValidation(ExceptionType type, String message)
	{
		super(message);
		this.type=type;
	}
	
}