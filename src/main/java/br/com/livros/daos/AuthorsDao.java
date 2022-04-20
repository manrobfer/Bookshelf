package br.com.livros.daos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.livros.exceptions.AuthorNotFoundException;
import br.com.livros.models.Author;
import br.com.livros.repositories.AuthorsRepositories;

@Repository
public class AuthorsDao {
	
	@Autowired
	AuthorsRepositories authorsRepository;
	
	
	public List<Author> findAll() {
		return (List<Author>) authorsRepository.findAll();}
	
	public Optional<Author> findById(Long id) {
		Optional<Author> author = authorsRepository.findById(id);	
		if ( (author == null) || (author.isEmpty() )) {
			throw new AuthorNotFoundException(id);
		}
		
		return authorsRepository.findById(id);
		}
	
	public Author save(Author author) {
		return authorsRepository.save(author);
	}
	
	public Author delete(Author author) {
		authorsRepository.delete(author);
	    return null;
	}

}
