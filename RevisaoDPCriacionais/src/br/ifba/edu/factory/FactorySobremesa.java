package br.ifba.edu.factory;

import br.ifba.edu.modelo.Prato;
import br.ifba.edu.modelo.Sobremesa;

public class FactorySobremesa extends Factory{

	@Override
	protected Prato BuildPrato() {
		return new Sobremesa();
	}
	
}
