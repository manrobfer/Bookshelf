package br.com.livros.models;

import java.io.Serializable;
import java.sql.Date;

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
@Table(name = "AUTORES")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Author implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name =  "AUT_ID")
	private Long id;
	
	@Column(name = "AUT_CDG")
	private String codigo;
	
	@Column(name = "AUT_NM")
	private String nome;
	
	@Column(name = "AUT_DTN")
	private Date nascimento;
	
	@Column(name = "NCL_ID ")
	private int nacionalidade_id;
	

}
