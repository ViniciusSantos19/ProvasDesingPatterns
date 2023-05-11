package ifba.edu.br.modelo;

import java.util.ArrayList;
import java.util.List;

public class Ementa {
	
	private String codigo;
	private String nome;	
	private List<Disciplina> disciplinas;
	private List<Livro> livros;
	
	
	
	public Ementa(String codigo, String nome, List<Disciplina> disciplinas, List<Livro> livros) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.disciplinas = new ArrayList<Disciplina>(disciplinas);
		this.livros = new ArrayList<Livro>(livros);
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public List<Livro> getLivros() {
		return livros;
	}
	
	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	
	
	
}
