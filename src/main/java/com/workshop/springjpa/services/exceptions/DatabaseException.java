package com.workshop.springjpa.services.exceptions;

/***
 * 
 * @author Dionatan Leão
 *
 */

public class DatabaseException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public DatabaseException(String message) {
		super(message);
	}

}
