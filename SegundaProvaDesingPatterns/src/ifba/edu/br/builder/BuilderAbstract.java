package ifba.edu.br.builder;

import java.util.ArrayList;
import java.util.List;

import ifba.edu.br.modelo.Disciplina;
import ifba.edu.br.modelo.Livro;

public abstract class BuilderAbstract<T> implements CursoBuilderInterface<T>{
	
	protected String codigo;
	protected String nome;
	protected List<Disciplina> disciplinas;
	protected List<Livro> livros;	
	
	public BuilderAbstract(){
		this.reset();
	}
	
	@Override
	public CursoBuilderInterface<T> reset() {
		this.codigo = "";
		this.nome = "";
		this.disciplinas= new ArrayList<Disciplina>();
		this.livros= new ArrayList<Livro>();
		return this;
	}

	@Override
	public CursoBuilderInterface<T> setNome(String nome) {
		this.nome = nome;
		return this;
	}

	@Override
	public CursoBuilderInterface<T> setCodigo(String codigo) {
		this.codigo = codigo;
		return this;
	}

	@Override
	public CursoBuilderInterface<T> addDisciplina(Disciplina disciplina) {
		this.disciplinas.add(disciplina);
		return this;
	}

	@Override
	public CursoBuilderInterface<T> addLivro(Livro livro) {
		this.livros.add(livro);
		return this;
	}

	
}
