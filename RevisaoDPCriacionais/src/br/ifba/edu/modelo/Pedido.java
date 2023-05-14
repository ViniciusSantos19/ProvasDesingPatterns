package br.ifba.edu.modelo;

import java.util.ArrayList;
import java.util.List;

import br.ifba.edu.prototype.Prototipavel;

public class Pedido extends Prato{
	
	
	private List<Prato> pratos;
	
	

	public Pedido(List<Prato> pratos, String nome, String codigo) {
		super(nome, codigo);
		this.pratos = new ArrayList<Prato>(pratos);
	}

	public Pedido() {}
	
	public Pedido(Pedido pedido) {
		super(pedido);
		this.pratos = new ArrayList<Prato>(pedido.pratos);
	}

	public List<Prato> getPratos() {
		return pratos;
	}


	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return pratos.stream().mapToDouble(a -> a.getPreco()).sum();
	}

	public Prototipavel clonar() {
		return new Pedido(this);
	}
	
	
	
}
