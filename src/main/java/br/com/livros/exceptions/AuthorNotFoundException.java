package br.com.livros.exceptions;

import br.com.livros.staticMessages.StaticerrorMessages;

public class AuthorNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public AuthorNotFoundException(Long id) {
		super(String.format(StaticerrorMessages.ID_NO_FOUND,id));
	}
	
	public AuthorNotFoundException(String errorMessage) {
		super(errorMessage);
	}
	
	
	

}
