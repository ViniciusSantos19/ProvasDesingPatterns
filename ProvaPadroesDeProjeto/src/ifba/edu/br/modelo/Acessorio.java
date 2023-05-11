package ifba.edu.br.modelo;

public class Acessorio extends Equipamento{

	private String descricao;
	
	public Acessorio(String identificador, int quantidade) {
		super(identificador, quantidade);
		// TODO Auto-generated constructor stub
	}

	public Acessorio(String identificador, int quantidade, String descricao) {
		super(identificador, quantidade);
		this.descricao = descricao;
	}
	
	public Acessorio() {
		super(null, 0);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String toString() {
		return "Acessório - " + super.toString() + " - " 
				+ this.getIdentificador();
	}
	
	
	
}
