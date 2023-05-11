package ifba.edu.br.modelo;

public class Halter extends Equipamento{

	private double peso;
	
	public Halter(String identificador, int quantidade) {
		super(identificador, quantidade);
		// TODO Auto-generated constructor stub
	}

	public Halter(String identificador, int quantidade, double peso) {
		super(identificador, quantidade);
		this.peso = peso;
	}

	
	
	public Halter() {
		super(null, 0);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String toString() {
		return "Halteres - " + super.toString() + " - " 
				+ this.getPeso() + "Kg." ;
	}	
	
	

}
