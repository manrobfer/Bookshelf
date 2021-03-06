package br.com.livros.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.livros.daos.CathegoryDao;
import br.com.livros.exceptions.CathegoryNotFoundException;
import br.com.livros.exceptions.NoDataFoundException;
import br.com.livros.interfaces.CathegoryService;
import br.com.livros.models.Cathegory;

@Service
public class CathegoryServiceImpl implements CathegoryService {

	@Autowired
	CathegoryDao cathegoryDao;

	

	@Override
	public Cathegory findById(Long id) {
		return cathegoryDao.findById(id).orElseThrow(() -> new CathegoryNotFoundException(id));
	}

	@Override
	public Cathegory save(Cathegory catherory) {
		return cathegoryDao.save(catherory);
	}

	@Override
	public List<Cathegory> findAll() {
		List<Cathegory> cathegories = cathegoryDao.findAllCategories();

		if (cathegories.isEmpty()) {
			throw new NoDataFoundException();
		}

		return cathegories;

	}

	@Override
	public Cathegory delete(Cathegory catherory) {
		
		return  cathegoryDao.delete(catherory);
	}
	
	

}
