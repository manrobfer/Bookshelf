package br.com.livros.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.livros.daos.AuthorsDao;
import br.com.livros.models.Author;

@Service
public class AthorsServiceImpl implements AuthorsService {
	
	@Autowired
	AuthorsDao authors;

	@Override
	public Optional<Author> findById(Long id) {
		
		return authors.findById(id);
	}

	@Override
	public Author save(Author author) {
		  return authors.save(author);
	}

	@Override
	public Author delete(Author author) {		
		return authors.delete(author);
	}

	@Override
	public List<Author> findAll() {		
		return authors.findAll();
	}

}
