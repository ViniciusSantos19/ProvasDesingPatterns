package br.ifba.edu.builder;

import br.ifba.edu.modelo.PratoFeito;
import br.ifba.edu.modelo.Sobremesa;
import br.ifba.edu.modelo.TipoCulinaria;

public class BuilderSobremesa extends AbstractBuilder<Sobremesa>{

	private double preco;
	private String descricao;
	private int calorias;
	private TipoCulinaria tipo;
	
	public static BuilderSobremesa factory() {
		return new BuilderSobremesa();
	}
	
	@Override
	public BuilderSobremesa reset() {
		this.preco = 0;
		this.descricao = "";
		this.calorias = 0;
		this.tipo = null;
		this.codigo = "0";
		this.nome = "";
		return this;
	}
	
	public BuilderSobremesa setNome(String nome) {
		this.nome = nome;
		return this;
	}
	
	public BuilderSobremesa setCodigo(String codigo) {
		this.codigo = codigo;
		return this;
	}
	
	public BuilderSobremesa setPreco(double preco) {
		this.preco = preco;
		return this;
	}
	
	public BuilderSobremesa setDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}
	
	public BuilderSobremesa setTipoCulinaria(TipoCulinaria tipo) {
		this.tipo = tipo;
		return this;
	}
	
	public BuilderSobremesa setCalorias(int calorias) {
		this.calorias = calorias;
		return this;
	}
	
	@Override
	public Sobremesa build() {
		return new Sobremesa(preco, descricao, calorias, tipo, nome, codigo);
	}

}
