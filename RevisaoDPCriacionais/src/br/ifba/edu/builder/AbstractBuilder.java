package br.ifba.edu.builder;


public abstract class AbstractBuilder<T>  {

	protected String codigo;
	protected String nome;
	
	public AbstractBuilder (){
		this.reset();
	}
	
	public abstract AbstractBuilder<T> reset();
	public abstract AbstractBuilder<T> setNome(String nome);
	public abstract AbstractBuilder<T> setCodigo(String codigo);
	public abstract T build();
	
	
}
