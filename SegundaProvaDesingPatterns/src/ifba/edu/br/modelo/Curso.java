package ifba.edu.br.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ifba.edu.br.prototype.Prototipavel;

public class Curso extends Produto{
	
	private List<Livro> livros;
	private List<Disciplina> disciplinas;
	
	public Curso(){}
	
	public Curso(String codigo, String nome) {
		super(codigo, nome);
		this.livros = new ArrayList<Livro>();
		this.disciplinas = new ArrayList<Disciplina>();
	}
	
	private Curso(Curso curso) {
		super(curso);
		this.disciplinas = curso.disciplinas.stream().map(d -> (Disciplina) d.prototipar()).
				collect(Collectors.toList());
		this.livros = curso.livros.stream().map(l -> (Livro) l.prototipar()).
				collect(Collectors.toList());
	}
	
	public Curso(String codigo, String nome, List<Livro> livros, List<Disciplina> disciplinas) {
		super(codigo, nome);
		this.livros = new ArrayList<Livro>(livros);
		this.disciplinas = new ArrayList<Disciplina>(disciplinas);
	}
	
	@Override
	public Prototipavel prototipar() {
		return new Curso(this);
	}
	@Override
	public double GetPreco() {
		return 0;
	}
	
	
	
	
}
