package ifba.edu.br.factory;

import ifba.edu.br.modelo.Produto;

public abstract class Factory {
	public Produto getProduto(String codigo, String nome) {
		Produto produto = this.criarProduto();
		produto.setCodigo(codigo);
		produto.setNome(nome);
		return produto;
	}
	
	protected abstract Produto criarProduto();
	
}
