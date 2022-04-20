package br.com.livros.exceptions;

public class NationalityException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NationalityException() {
		super("Something went wrong while performing this opetarion");
	}
	
	public NationalityException(String msg) {
		super(msg);
	}

}
