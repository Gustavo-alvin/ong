package com.itb.charitycloset.ong.model;

public class Produto {
	
	private long id;
	private String nome;
	private String descricao;
	private String codigoBarras;
	private double preco;
	private boolean codStatus;
	// public: acesso liberado para todas as classes.
	
		// private: acesso permitido apenas para os membros
		// da propria classe
		// entende-se por membros(atributos e ou metodos)
	//metodo setter's e getter's: atribuir e recuperar dados dp atributo respectivamente
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public boolean getCodStatus() {
		return codStatus;
	}
	public void setCodStatus(boolean codStatus) {
		this.codStatus = codStatus;
	}
	
	
	
	
	
}
