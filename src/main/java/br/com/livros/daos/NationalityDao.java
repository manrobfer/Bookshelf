package br.com.livros.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.livros.models.Nationality;
import br.com.livros.repositories.NationalityRepository;

public class NationalityDao {
	
	@Autowired
	NationalityRepository nationality;
	
	
	public List<Nationality> findAll(){
		return (List<Nationality>) nationality.findAll();
		
	}

}
