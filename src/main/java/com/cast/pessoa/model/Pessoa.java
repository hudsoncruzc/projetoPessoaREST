package com.cast.pessoa.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 * Classe Entity Pessoa
 *
 * @author <a href="mailto:hcamposcruz@gmail.com">Hudson de Campos Cruz</a>.
 */


@Entity
public class Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idPessoa;
	
	private String nomPessoa;
	private String endRua;
	private String endNumero;
	private String endBairro;
	private String endCidade;
	private String endUF;
	private String endCelular;
	private String endTelefone;

	
	
	public long getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(long idPessoa) {
		this.idPessoa = idPessoa;
	}
	public String getNomPessoa() {
		return nomPessoa;
	}
	public void setNomPessoa(String nomPessoa) {
		this.nomPessoa = nomPessoa;
	}
	public String getEndRua() {
		return endRua;
	}
	public void setEndRua(String endRua) {
		this.endRua = endRua;
	}
	public String getEndNumero() {
		return endNumero;
	}
	public void setEndNumero(String endNumero) {
		this.endNumero = endNumero;
	}
	public String getEndBairro() {
		return endBairro;
	}
	public void setEndBairro(String endBairro) {
		this.endBairro = endBairro;
	}
	public String getEndCidade() {
		return endCidade;
	}
	public void setEndCidade(String endCidade) {
		this.endCidade = endCidade;
	}
	public String getEndUF() {
		return endUF;
	}
	public void setEndUF(String endUF) {
		this.endUF = endUF;
	}
	public String getEndCelular() {
		return endCelular;
	}
	public void setEndCelular(String endCelular) {
		this.endCelular = endCelular;
	}
	public String getEndTelefone() {
		return endTelefone;
	}
	public void setEndTelefone(String endTelefone) {
		this.endTelefone = endTelefone;
	}
	

}
