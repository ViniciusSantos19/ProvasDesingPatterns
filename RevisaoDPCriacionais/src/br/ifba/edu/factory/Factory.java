package br.ifba.edu.factory;

import br.ifba.edu.modelo.Prato;

public abstract class Factory {
	
	public Prato getPrato(String nome, String codigo) {
		Prato prato = BuildPrato();
		prato.setCodigo(codigo);
		prato.setNome(nome);
		return prato;
	}
	
	protected abstract Prato BuildPrato();

	
}
