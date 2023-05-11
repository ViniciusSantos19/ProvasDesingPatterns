package ifba.edu.br.factory;

import ifba.edu.br.modelo.Equipamento;
import ifba.edu.br.modelo.Halter;

public class HalterFactory extends EquipamentoFactory{

	@Override
	protected Equipamento criarEquipamento() {
		// TODO Auto-generated method stub
		return new Halter();
	}

}
