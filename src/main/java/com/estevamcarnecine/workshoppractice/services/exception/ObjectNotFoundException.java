package com.estevamcarnecine.workshoppractice.services.exception;

public class ObjectNotFoundException extends RunTimeException {
	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(String msg) {
		super(msg);
	}
}
