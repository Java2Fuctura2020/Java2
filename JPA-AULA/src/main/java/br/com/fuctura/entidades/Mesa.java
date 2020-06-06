package br.com.fuctura.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mesa2")
public class Mesa {
	@Id
	@GeneratedValue
	private Long id;

	@Column(length = 20, name = "marca", nullable = false)
	private String marcaDaMesa;
	
	public Long getId() {
		return id;
	}

	public String getMarcaDaMesa() {
		return marcaDaMesa;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setMarcaDaMesa(String marcaDaMesa) {
		this.marcaDaMesa = marcaDaMesa;
	}
}
