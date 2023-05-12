package ifba.edu.br.factory;

import ifba.edu.br.modelo.Curso;
import ifba.edu.br.modelo.Produto;

public class CursoFactory extends Factory{

	@Override
	protected Produto criarProduto() {
		return new Curso();
	}

}
