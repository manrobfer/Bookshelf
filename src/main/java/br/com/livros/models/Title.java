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
@Table(name = "TITULO")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Title implements Serializable{
  	
	
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "TTL_ID")
  private Long  id; ;
  
  @Column(name = "TTL_CDG")
  private String codigo ; 
  
  @Column(name = "TTL_TTL")
  private String titulo ; 
  
  @Column(name = "TTL_EDC")
  private String edicao ; 
  
  @Column(name = " TTL_PGN")
  private String paginas;
  
  @Column(name = "TTL_ATR_ID")
  private String  author_id; 
  
  @Column(name = "TTL_CTGR_ID")
  private String cathegory_id ;
  
  @Column(name = "TTL_ANO")
  private String edtion_year ; 



}
