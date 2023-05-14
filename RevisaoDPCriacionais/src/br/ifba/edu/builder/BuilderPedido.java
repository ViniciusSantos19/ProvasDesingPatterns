package br.ifba.edu.builder;

import java.util.ArrayList;
import java.util.List;

import br.ifba.edu.modelo.Pedido;
import br.ifba.edu.modelo.Prato;

public class BuilderPedido extends AbstractBuilder<Pedido>{
	
	private List<Prato> pratos;
	
	public static BuilderPedido factory() {
		return new BuilderPedido();
	}
	
	@Override
	public BuilderPedido reset() {
		this.nome = "";
		this.codigo = "";
		this.pratos = new ArrayList<Prato>();
		return this;
	}
	
	public BuilderPedido setNome(String nome) {
		this.nome = nome;
		return this;
	}
	
	public BuilderPedido setCodigo(String codigo) {
		this.codigo = codigo;
		return this;
	}
	
	public BuilderPedido addPrato(Prato prato) {
		this.pratos.add(prato);
		return this;
	}

	@Override
	public Pedido build() {
		// TODO Auto-generated method stub
		return new Pedido(pratos, nome, codigo);
	}

	
}
