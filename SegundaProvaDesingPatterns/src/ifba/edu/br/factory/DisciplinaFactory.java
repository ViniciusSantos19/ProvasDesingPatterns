package ifba.edu.br.factory;

import ifba.edu.br.modelo.Disciplina;
import ifba.edu.br.modelo.Produto;

public class DisciplinaFactory extends Factory{

	@Override
	protected Produto criarProduto() {
		return new Disciplina();
	}

}
