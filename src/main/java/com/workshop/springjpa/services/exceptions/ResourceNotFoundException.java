package com.workshop.springjpa.services.exceptions;

/***
 * 
 * @author Dionatan Leão
 *
 */

public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super("Resource not found. Id " + id);
	}

}
