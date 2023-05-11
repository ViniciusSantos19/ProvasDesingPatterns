package ifba.edu.br.factory;

import ifba.edu.br.modelo.Acessorio;
import ifba.edu.br.modelo.Equipamento;

public class AcessorioFactory extends EquipamentoFactory{

	@Override
	protected Equipamento criarEquipamento() {
		
		return new Acessorio();
	}

}
