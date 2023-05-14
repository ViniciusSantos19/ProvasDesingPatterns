package br.ifba.edu.modelo;

import br.ifba.edu.prototype.Prototipavel;

public class PratoFeito extends Prato{
	
	private double preco;
	private String descricao;
	private int tempoDePreparo;//em minutos
	private TipoCulinaria tipo;
	
	public PratoFeito(PratoFeito pratoFeito) {
		super(pratoFeito);
		this.descricao = pratoFeito.descricao;
		this.preco = pratoFeito.preco;
		this.tempoDePreparo = pratoFeito.tempoDePreparo;
		this.tipo = pratoFeito.tipo;
	}
	
	public PratoFeito(){
		
	}
	
	public PratoFeito(String descricao, int tempoDePreparo, double preco,TipoCulinaria tipo ,String nome, String codigo) {
		super(nome, codigo);
		this.descricao = descricao;
		this.tempoDePreparo = tempoDePreparo;
		this.preco = preco;
		this.tipo = tipo;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public int getTempoDePreparo() {
		return tempoDePreparo;
	}



	public void setTempoDePreparo(int tempoDePreparo) {
		this.tempoDePreparo = tempoDePreparo;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public double getPreco() {
		return this.preco;
	}

	public TipoCulinaria getTipo() {
		return tipo;
	}

	public void setTipo(TipoCulinaria tipo) {
		this.tipo = tipo;
	}

	public Prototipavel clonar() {
		// TODO Auto-generated method stub
		return new PratoFeito(this);
	}
	
	
}
