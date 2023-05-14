package br.ifba.edu.factory;

import br.ifba.edu.modelo.Bebida;
import br.ifba.edu.modelo.Prato;

public class FactoryBebida extends Factory{

	@Override
	protected Prato BuildPrato() {
		return new Bebida();
	}
	
}
