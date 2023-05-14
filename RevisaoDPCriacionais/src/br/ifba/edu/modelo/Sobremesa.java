package br.ifba.edu.modelo;

import br.ifba.edu.prototype.Prototipavel;

public class Sobremesa extends Prato{

	private double preco;
	private String descricao;
	private int calorias;
	private TipoCulinaria tipo;
	
	
	
	public Sobremesa(double preco, String descricao, int calorias, TipoCulinaria tipo, String nome, String codigo) {
		super(nome, codigo);
		this.preco = preco;
		this.descricao = descricao;
		this.calorias = calorias;
		this.tipo = tipo;
	}

	public Sobremesa() {
		
	}
	
	public Sobremesa (Sobremesa sobremesa) {
		super(sobremesa);
		this.descricao = sobremesa.descricao;
		this.calorias = sobremesa.calorias;
		this.preco = sobremesa.preco;
		this.tipo = sobremesa.tipo;
	}

	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public int getCalorias() {
		return calorias;
	}

	

	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}



	public TipoCulinaria getTipo() {
		return tipo;
	}



	public void setTipo(TipoCulinaria tipo) {
		this.tipo = tipo;
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
		return new Sobremesa(this);
	}

}
