package br.com.livros.services;

import java.util.List;
import java.util.Optional;

import br.com.livros.models.Author;

public interface AuthorsService {
	
	 Optional<Author> findById(Long id);
	 Author save(Author author);
	 Author delete(Author author);
	 List<Author> findAll();
	
	

}
