package br.com.livros.interfaces;

import java.util.List;

import br.com.livros.models.Nationality;


public interface NationalityService {
	
	Nationality findById(Long id);
	Nationality save(Nationality nationality);
	List<Nationality> findAll();

}
