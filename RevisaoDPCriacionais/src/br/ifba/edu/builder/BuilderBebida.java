package br.ifba.edu.builder;

import br.ifba.edu.modelo.Bebida;
import br.ifba.edu.modelo.TipoCulinaria;

public class BuilderBebida extends AbstractBuilder<Bebida>{

	private double preco;
	private String descricao;
	private int volume;
	private int teorAlcolico;
	private TipoCulinaria tipo;
	
	public static BuilderBebida factory() {
		return new BuilderBebida();
	}
	
	
	
	@Override
	public BuilderBebida reset() {
		this.preco = 0;
		this.descricao = "";
		this.teorAlcolico = 0;
		this.tipo = null;
		this.codigo = "0";
		this.nome = "";
		return this;
	}
	
	public BuilderBebida setNome(String nome) {
		this.nome = nome;
		return this;
	}
	
	public BuilderBebida setCodigo(String codigo) {
		this.codigo = codigo;
		return this;
	}
	
	public BuilderBebida setPreco(double preco) {
		this.preco = preco;
		return this;
	}
	
	public BuilderBebida setDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}
	
	public BuilderBebida  setTempoDePreparo(int teorAlcolico) {
		this.teorAlcolico = teorAlcolico;
		return this;
	}
	
	public BuilderBebida  setTipoCulinaria(TipoCulinaria tipo) {
		this.tipo = tipo;
		return this;
	}

	@Override
	public Bebida build() {
		// TODO Auto-generated method stub
		return new Bebida(preco, descricao, volume, teorAlcolico, tipo, nome, codigo);
	}
	
}
