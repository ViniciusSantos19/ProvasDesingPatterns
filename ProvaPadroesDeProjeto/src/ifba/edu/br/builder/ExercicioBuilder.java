package ifba.edu.br.builder;

import java.util.ArrayList;
import java.util.List;

import ifba.edu.br.modelo.Equipamento;
import ifba.edu.br.modelo.Exercicio;
import ifba.edu.br.modelo.GrupoMuscular;
import ifba.edu.br.modelo.TipoExercicio;

public class ExercicioBuilder implements Builder{
	
	private String descricao;
	private List<GrupoMuscular> gruposMusculares;
	private List<TipoExercicio> tiposDeExercicio;
	private List<Equipamento> equipamentos;
	@Override
	public Builder reset() {
		this.descricao = null;
		this.equipamentos = new ArrayList<Equipamento>();
		this.gruposMusculares = new ArrayList<GrupoMuscular>();
		this.tiposDeExercicio = new ArrayList<TipoExercicio>();
		return this;
	}
	@Override
	public Builder setDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}
	@Override
	public Builder setGrupoMuscular(GrupoMuscular gruspoMuscular) {
		this.gruposMusculares.add(gruspoMuscular);
		return this;
	}
	@Override
	public Builder setTipoExercicio(TipoExercicio tipoExercicio) {
		this.tiposDeExercicio.add(tipoExercicio);
		return this;
	}
	@Override
	public Builder setEquipamento(Equipamento equipamenot) {
		this.equipamentos.add(equipamenot);
		return this;
	}
	
	public Exercicio build(String id) {
		return new Exercicio(id, descricao, gruposMusculares, tiposDeExercicio, equipamentos);
	}
	
	public static Builder getInstancia() {
		return new ExercicioBuilder();
	}
	
}
