package br.ifba.edu.modelo;

import br.ifba.edu.prototype.Prototipavel;

public abstract class Prato implements Prototipavel{
	private String nome;
	private String codigo;
	
	public Prato() {
		
	}
	
	public Prato(Prato prato) {
		this.nome = prato.nome;
		this.codigo = prato.codigo;
	}
	
	public Prato(String nome, String codigo) {
		super();
		this.nome = nome;
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public abstract double getPreco();
	
}
