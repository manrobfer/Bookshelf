package br.com.livros.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.livros.exceptions.NationalityException;
import br.com.livros.interfaces.NationalityService;
import br.com.livros.models.Nationality;
import br.com.livros.repositories.NationalityRepository;

@Service
public class NationalityServiceImpl implements NationalityService {
	
	@Autowired
	NationalityRepository nationalityRepository;

	@Override
	public Nationality findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Nationality save(Nationality nationality) throws NationalityException  {
		nationalityRepository.save(nationality);
		return null;
	}

	@Override
	public List<Nationality> findAll() {
		List<Nationality> nationalities =  (List<Nationality>) nationalityRepository.findAll();
		
		if(nationalities.isEmpty()) {
			throw new NationalityException("There is no nationality available");
		}
		
		return nationalities;
	}

}
