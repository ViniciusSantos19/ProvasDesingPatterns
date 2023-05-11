package ifba.edu.br.modelo;

public class Maquina extends Equipamento{

	private String marca;
	private String descricao;
	
	public Maquina(String identificador, int quantidade) {
		super(identificador, quantidade);
		// TODO Auto-generated constructor stub
	}

	public String getMarca() {
		return marca;
	}
	
	public Maquina() {
		super(null, 0);
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Maquina(String identificador, int quantidade, String marca, String descricao) {
		super(identificador, quantidade);
		this.marca = marca;
		this.descricao = descricao;
	}

	public String toString() {
		return "Máquina - " + super.toString()  
				+ (this.getDescricao() != null ? " - " + this.getDescricao() : "")   
				+ (this.getMarca() != null ? " - " + this.getMarca() : "");
	}	
	
	

}
