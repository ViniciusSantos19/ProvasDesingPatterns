package br.ifba.edu.modelo;

import br.ifba.edu.prototype.Prototipavel;

public class Bebida extends Prato{

	private double preco;
	private String descricao;
	private int volume;
	private int teorAlcolico;
	private TipoCulinaria tipo;
	
	
	public Bebida() {
		
	}
	
	public Bebida(Bebida bebida) {
		super(bebida);
		this.descricao = bebida.descricao;
		this.preco = bebida.preco;
		this.teorAlcolico = bebida.teorAlcolico;
		this.tipo = bebida.tipo;
		this.volume = bebida.volume;
	}	
	
	public Bebida(double preco, String descricao, int volume, int teorAlcolico, TipoCulinaria tipo, String nome, String codigo) {
		super(nome, codigo);
		this.preco = preco;
		this.descricao = descricao;
		this.volume = volume;
		this.teorAlcolico = teorAlcolico;
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		
		this.descricao = descricao;
	}
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public int getTeorAlcolico() {
		return teorAlcolico;
	}
	
	public void setTeorAlcolico(int teorAlcolico) {
		this.teorAlcolico = teorAlcolico;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return this.preco;
	}

	public Prototipavel clonar() {
		// TODO Auto-generated method stub
		return new Bebida(this);
	}

}
