package ifba.edu.br.factory;

import ifba.edu.br.modelo.Equipamento;
import ifba.edu.br.modelo.Maquina;

public class MaquinaFactory extends EquipamentoFactory{

	protected Equipamento criarEquipamento() {
		// TODO Auto-generated method stub
		return new Maquina();
	}

	

}
