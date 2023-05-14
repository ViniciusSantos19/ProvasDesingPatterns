package br.ifba.edu.factory;

public class FactorySwtich {
	public static  Factory selectFactory(TipoPrato tipo) {
		switch(tipo) {
		case Bebida:
			return new FactoryBebida();
		case Sobremesa:
			return new FactorySobremesa();
		case PratoFeito:
			return new FactoryPratoFeito();
			default:
				return null;
		}
	}
}
