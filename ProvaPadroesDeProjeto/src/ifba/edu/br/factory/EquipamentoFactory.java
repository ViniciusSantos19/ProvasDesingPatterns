package ifba.edu.br.factory;

import ifba.edu.br.modelo.Equipamento;

public abstract class EquipamentoFactory {
	
	public Equipamento getEquipamento(String identificador, int quantidade) {
		Equipamento equipamento = this.criarEquipamento();
		equipamento.setIdentificador(identificador);
		equipamento.setQuantidade(quantidade);
		return equipamento;
	}
	
	protected abstract Equipamento criarEquipamento ();
	
}
