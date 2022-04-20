package br.com.livros.services;

import java.util.Optional;

import br.com.livros.models.Title;

public interface TitleService {
	
	public Iterable<Title> findAll(); 
	
	public Optional<Title> findById(Long id);
	
	public Title save(Title title);	
	
	public Title delete(Title title);

}
