package br.com.livros.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="CATEGORIAS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Cathegory implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_CAT")
	@SequenceGenerator( sequenceName="SQ_CAT",allocationSize = 1 ,name="SQ_CAT")	
	@Column(name = "CAT_ID")
	private Long catid;
	
	@NotNull
	@Column(name = "CAT_CDGO")
	private int codigo;
	
	@NotNull
	@Column(name = "CAT_NM")
	private String nome;
	
	@NotBlank
	@NotNull
	@Column(name = "CAT_DESCR")
	private String descricao;

	
	
}
