package ifba.edu.br.builder;

import ifba.edu.br.modelo.Ementa;

public class EmentaBuilder extends BuilderAbstract<Ementa>{

	public static EmentaBuilder factory() {
		return new EmentaBuilder();
	}
	
	@Override
	public Ementa build() {
		
		return new Ementa(this.codigo, this.nome, this.disciplinas, this.livros);
	}
	
}
