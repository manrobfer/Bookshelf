package br.com.livros.interfaces;

import java.util.List;

import br.com.livros.models.Cathegory;

public interface CathegoryService {
	
	 Cathegory findById(Long id);
	 Cathegory save(Cathegory catherory);
	 Cathegory delete(Cathegory catherory);
	 List<Cathegory> findAll();

}
