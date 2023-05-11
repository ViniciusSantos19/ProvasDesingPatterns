package ifba.edu.br.builder;

import ifba.edu.br.modelo.Curso;

public class CursoBuilder extends BuilderAbstract<Curso>{

	public static CursoBuilder factory() {
		return new CursoBuilder();
	}
	
	@Override
	public Curso build() {
		// TODO Auto-generated method stub
		return new Curso(this.codigo, this.nome, this.livros, this.disciplinas);
	}

}
