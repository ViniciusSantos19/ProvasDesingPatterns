package br.ifba.edu.factory;

import br.ifba.edu.modelo.Prato;
import br.ifba.edu.modelo.PratoFeito;

public class FactoryPratoFeito extends Factory{

	@Override
	protected Prato BuildPrato() {
		// TODO Auto-generated method stub
		 return new PratoFeito();
	}

}
