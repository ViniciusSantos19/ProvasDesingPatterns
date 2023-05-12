package ifba.edu.br.modelo;

import ifba.edu.br.prototype.Prototipavel;

public class Disciplina extends Produto{
	
	private int chTotal;
	private double pcCumprido;
	private double preco;
	
	public Disciplina(String codigo, String nome) {
		super(codigo, nome);
	}
	
	public Disciplina(int chTotal, double pcCumprido, double preco, String nome, String codigo) {
		super(codigo, nome);
		this.chTotal = chTotal;
		this.pcCumprido = pcCumprido;
		this.preco = preco;
	}
	
	public Disciplina(Disciplina disciplina) {
		super(disciplina);
		this.chTotal = disciplina.chTotal;
		this.pcCumprido = disciplina.pcCumprido;
		this.preco = disciplina.preco;
	}
	
	public Disciplina() {
		
	}

	public int getChTotal() {
		return chTotal;
	}

	public void setChTotal(int chTotal) {
		this.chTotal = chTotal;
	}

	public double getPcCumprido() {
		return pcCumprido;
	}

	public void setPcCumprido(double pcCumprido) {
		this.pcCumprido = pcCumprido;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public double GetPreco() {
		return this.preco;
	}

	@Override
	public Prototipavel prototipar() {
		return new Disciplina(this);
	}
	
	public String toString() {
		return "#Disciplina#" + super.toString();
	}
	
}
