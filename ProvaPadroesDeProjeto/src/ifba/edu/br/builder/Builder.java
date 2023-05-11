package ifba.edu.br.builder;

import ifba.edu.br.modelo.Equipamento;
import ifba.edu.br.modelo.Exercicio;
import ifba.edu.br.modelo.GrupoMuscular;
import ifba.edu.br.modelo.TipoExercicio;

public interface Builder {
	
	public Builder reset();
	public Builder setDescricao(String descricao);
	public Builder setGrupoMuscular(GrupoMuscular gruspoMuscular);
	public Builder setTipoExercicio(TipoExercicio tipoExercicio);
	public Builder setEquipamento(Equipamento equipamenot);
	public Exercicio build(String id);
}
