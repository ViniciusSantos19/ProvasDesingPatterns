package ifba.edu.br.builder;

import ifba.edu.br.modelo.Disciplina;
import ifba.edu.br.modelo.Livro;

public interface CursoBuilderInterface<T> {
	
	public CursoBuilderInterface<T> reset();
	public CursoBuilderInterface<T> setNome(String nome);
	public CursoBuilderInterface<T> setCodigo(String codigo);
	public CursoBuilderInterface<T> addDisciplina(Disciplina disciplina);
	public CursoBuilderInterface<T> addLivro(Livro livro);
	public T build();
	
}
