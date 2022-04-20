package br.com.livros.services.implementation;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.livros.LivrosStarter;
import br.com.livros.daos.AuthorsDao;
import br.com.livros.exceptions.AuthorNotFoundException;
import br.com.livros.models.Author;
import br.com.livros.services.AuthorsService;

@Service
public class AthorsServiceImpl implements AuthorsService {
	
	private static Logger log = LogManager.getLogger(AthorsServiceImpl.class);
	
	@Autowired
	AuthorsDao authors;

	@Override
	public Optional<Author> findById(Long id) {	
		Optional<Author> author = authors.findById(id);	
		return author;
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
		List<Author> auths = authors.findAll();
		
		if (auths.isEmpty()) {		
		   log.error("Could not find any authors.");	
		   throw new AuthorNotFoundException("Could not find any authors.");
	  }
		return auths;
	}
}

	
