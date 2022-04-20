package br.com.livros.daos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.livros.models.Title;
import br.com.livros.repositories.TitleRepository;

@Repository
public class TitleDao {
	
	@Autowired
	TitleRepository  tituloRepository;
	
	public void create(Title title) {
		this.tituloRepository.save(title);
	}
	
	public List<Title> readAll (){
		return (List<Title>) this.tituloRepository.findAll();
	}
	
	public Optional<Title> read(Long id) {
		return this.tituloRepository.findById(id);
		}
	
	public void delete(Title title) {
		this.tituloRepository.delete(title);
		
	}

}
