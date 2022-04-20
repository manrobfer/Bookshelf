package br.com.livros.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.livros.models.Title;

@Repository
public interface TitleRepository extends CrudRepository<Title, Long> {

}
