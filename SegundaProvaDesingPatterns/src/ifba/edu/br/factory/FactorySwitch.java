package ifba.edu.br.factory;

import ifba.edu.br.modelo.TipoProduto;

public class FactorySwitch {
	public static Factory getFactory (TipoProduto tipo) throws ClassNotFoundException {
		switch(tipo) {
		case Disciplina:
			return new DisciplinaFactory();
		case Livro:
			return new LivroFactory();
		case Curso:
			return new CursoFactory();
			default:
				 throw new ClassNotFoundException("Factory não encontrada para o nome: " + tipo);
		}
	}
}
