package br.ifba.edu.factory;

import br.ifba.edu.modelo.Pedido;
import br.ifba.edu.modelo.Prato;

public class FactoryPedido extends Factory{

	@Override
	protected Prato BuildPrato() {
		return new Pedido();
	}
	
}
