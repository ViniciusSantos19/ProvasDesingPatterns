package ifba.edu.br.factory;

import ifba.edu.br.modelo.Livro;
import ifba.edu.br.modelo.Produto;

public class LivroFactory extends Factory{

	@Override
	protected Produto criarProduto() {
		
		return new Livro();
	}

}
