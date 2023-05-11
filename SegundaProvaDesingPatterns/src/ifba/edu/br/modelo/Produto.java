package ifba.edu.br.modelo;

import ifba.edu.br.prototype.Prototipavel;

public abstract class Produto implements Prototipavel{

	private String codigo;
	private String nome;
	
	public Produto() {
		
	}
	
	public Produto(Produto produto) {
		this.codigo = produto.codigo;
		this.nome = produto.nome;
	}
	
	public Produto(String codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
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


	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + "]";
	}
	
	public abstract double  GetPreco();
	
	
	
}
