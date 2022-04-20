package br.com.livros.services.implementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.livros.models.Title;
import br.com.livros.repositories.TitleRepository;
import br.com.livros.services.TitleService;

@Service
public class TitleServiceImpl implements TitleService  {
	
	@Autowired
	TitleRepository titleRepository;

	@Override
	public Iterable<Title> findAll() {
		Iterable<Title> authors = titleRepository.findAll();
		return authors;
	}

	

	@Override
	public Title save(Title title) {
	    titleRepository.save(title);
		return null;
	}

	@Override
	public Title delete(Title title ) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Optional<Title> findById(Long id) {
	
		return titleRepository.findById(id);
	}
	

}
