package br.ifba.edu.builder;

import br.ifba.edu.modelo.PratoFeito;
import br.ifba.edu.modelo.TipoCulinaria;

public class BuilderPratoFeito extends AbstractBuilder<PratoFeito>{
	
	private double preco;
	private String descricao;
	private int tempoDePreparo;//em minutos
	private TipoCulinaria tipo;
	
	@Override
	public BuilderPratoFeito reset() {
		this.preco = 0;
		this.descricao = "";
		this.tempoDePreparo = 0;
		this.tipo = null;
		this.codigo = "0";
		this.nome = "";
		return this;
	}
	
	public BuilderPratoFeito setNome(String nome) {
		this.nome = nome;
		return this;
	}
	
	public BuilderPratoFeito setCodigo(String codigo) {
		this.codigo = codigo;
		return this;
	}
	
	public static BuilderPratoFeito factory() {
		return (BuilderPratoFeito) new  BuilderPratoFeito();
	}
	
	public BuilderPratoFeito setPreco(double preco) {
		this.preco = preco;
		return this;
	}
	
	public BuilderPratoFeito setDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}
	
	public BuilderPratoFeito setTempoDePreparo(int tempoDePreparo) {
		this.tempoDePreparo = tempoDePreparo;
		return this;
	}
	
	public BuilderPratoFeito setTipoCulinaria(TipoCulinaria tipo) {
		this.tipo = tipo;
		return this;
	}
	
	@Override
	public PratoFeito build() {
		return new PratoFeito(descricao, tempoDePreparo, preco, tipo, nome, codigo);
	}

	
}
