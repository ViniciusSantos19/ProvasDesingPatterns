package ifba.edu.br.modelo;

import ifba.edu.br.prototype.Prototipavel;

public class Livro extends Produto{
	
	private String isbn;
	private double preco;
	
	public Livro(String codigo, String nome) {
		super(codigo, nome);
	}
	
	public Livro(String isbn, String codigo, String nome, double preco) {
		super(codigo, nome);
		this.isbn = isbn;
		this.preco = preco;
	}

	public Livro(){
		
	}
	
	public Livro(Livro livro) {
		super(livro);
		this.isbn = livro.isbn;
		this.preco = livro.preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public double GetPreco() {
		return this.preco;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public Prototipavel prototipar() {
		return new Livro(this);
	}

	
	public String toString() {
		return "#Livro#" + super.toString();
	}
	
}
