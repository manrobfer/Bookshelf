package br.com.livros.daos;

import java.util.List;
import java.util.Optional;

import br.com.livros.dto.CategoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import br.com.livros.models.Cathegory;
import br.com.livros.repositories.CathegoryRepository;

@Component
public class CathegoryDao {
	
	@Autowired
	CathegoryRepository cathegoryRepository;
	
	
	public Cathegory save(CategoryDto category) {
		return cathegoryRepository.save(category.convertFromCathegoryDto());
		
	}
	
	public Cathegory delete(Cathegory category) {
		cathegoryRepository.delete(category);
		return null;
		
		
	}
	
	public List<Cathegory> findAllCategories(){
		return (List<Cathegory>) cathegoryRepository.findAll();
	}

	public Optional<Cathegory> findById(Long id) {
		return cathegoryRepository.findById(id);
		
	}
}
