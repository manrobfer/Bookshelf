package br.com.livros.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.livros.models.Nationality;

@Repository
public interface NationalityRepository  extends CrudRepository<Nationality, Long>  {
	}
