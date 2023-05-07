package br.com.livros.exceptions;

public class CathegoryNotFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CathegoryNotFoundException(Long id) {

		super(String.format("Cathegory with id (%d) not found",id));
	}
}
