package br.com.infnet.apicob.model.negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TCredor")
public class Credor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String razaosocial;
	private String cnpj;
	private String senha;
	private Boolean ativo;
	

	@Override
	public String toString() {
		return String.format("%s", 
				this.getRazaosocial()
				);
	}
	
	public Credor(){
		
	}
	
	public Credor(Integer id){
		this.setId(id);
	}	
	
	public Credor(String razaosocial, String cnpj, String senha, Boolean ativo){
		this.razaosocial = razaosocial;
		this.cnpj = cnpj;
		this.senha = senha;
		this.ativo = ativo;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRazaosocial() {
		return razaosocial;
	}

	public void setRazaosocial(String razaosocial) {
		this.razaosocial = razaosocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	

}
