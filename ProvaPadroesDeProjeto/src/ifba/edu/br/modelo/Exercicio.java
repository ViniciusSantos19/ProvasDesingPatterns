package ifba.edu.br.modelo;

import java.util.ArrayList;
import java.util.List;

public class Exercicio {
	private String id;
	private String descricao;
	private List<GrupoMuscular> gruposMusculares;
	private List<TipoExercicio> tiposDeExercicio;
	private List<Equipamento> equipamentos;
	
	public Exercicio(String id, String descricao, List<GrupoMuscular> gruposMusculares,
			List<TipoExercicio> tiposDeExercicio, List<Equipamento> equipamentos) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.gruposMusculares = new ArrayList<GrupoMuscular>(gruposMusculares);
		this.tiposDeExercicio = new ArrayList<TipoExercicio>(tiposDeExercicio);
		this.equipamentos = new ArrayList<Equipamento>(equipamentos);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<GrupoMuscular> getGruposMusculares() {
		return gruposMusculares;
	}

	public void setGruposMusculares(List<GrupoMuscular> gruposMusculares) {
		this.gruposMusculares = gruposMusculares;
	}

	public List<TipoExercicio> getTiposDeExercicio() {
		return tiposDeExercicio;
	}

	public void setTiposDeExercicio(List<TipoExercicio> tiposDeExercicio) {
		this.tiposDeExercicio = tiposDeExercicio;
	}

	public List<Equipamento> getEquipamentos() {
		return equipamentos;
	}

	public void setEquipamentos(List<Equipamento> equipamentos) {
		this.equipamentos = equipamentos;
	}

	
	public String toString() {
		String desc = this.id + "\t" + this.descricao;
		desc += "\n\t";		
		for(TipoExercicio tipo : this.tiposDeExercicio)
			desc += (tipo + "\n\t");
		if(this.tiposDeExercicio.size() == 0)
			desc += "\n\t";
		for(GrupoMuscular grupo : this.gruposMusculares)
			desc += (grupo + "\n\t");
		if(this.gruposMusculares.size() == 0)
			desc += "\n\t";
		for(Equipamento equipamento : this.equipamentos)
			desc += (equipamento + "\n\t");
		if(this.gruposMusculares.size() == 0)
			desc += "\n\t";
		return desc;
	}
	
	
}
