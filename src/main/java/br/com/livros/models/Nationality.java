package br.com.livros.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "NACIONALIDADES")
public class Nationality {
	
	
	@Column(name = "NCL_ID")
	@Id
	private Long id;	
	
	@Column(name = "NCL_CDG")
	private String codigo;
	
	
	@Column(name="NCL_PAIS")
	private String pais;
	
	@Column( name = "NCL_DSCR")
	private String descricao;

}
