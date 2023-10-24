package br.com.livros.services;

import java.util.List;

import br.com.livros.dto.CategoryDto;
import br.com.livros.models.Cathegory;

public interface CathegoryService {
	
	 Cathegory findById(Long id);
	public Cathegory save(CategoryDto catherory);
	Cathegory delete(Cathegory catherory);
	 List<Cathegory> findAll();

}
