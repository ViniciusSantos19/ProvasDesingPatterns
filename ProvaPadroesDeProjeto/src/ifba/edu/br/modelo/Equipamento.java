package ifba.edu.br.modelo;

import java.util.Objects;

public abstract class Equipamento {
	
	private String identificador;
	private int quantidade;
	
	public Equipamento(String identificador, int quantidade) {
		super();
		this.identificador = identificador;
		this.quantidade = quantidade;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(identificador);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipamento other = (Equipamento) obj;
		return Objects.equals(identificador, other.identificador);
	}
	
	public void aumentarQuantidade(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public String toString() {
		return "[ID: " + this.getIdentificador() + "]: " + 
				this.getQuantidade() + " unidades";
	}
	
}
