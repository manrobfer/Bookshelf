package br.com.livros.services;

import java.util.List;
import java.util.Optional;

import br.com.livros.dto.AuthorDto;
import br.com.livros.models.Author;

public interface AuthorsService {
	
	 Optional<Author> findById(Long id);
	 AuthorDto save(AuthorDto author);
	 Author delete(AuthorDto author);
	 List<Author> findAll();
	
	

}
