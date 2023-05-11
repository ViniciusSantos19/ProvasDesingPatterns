package ifba.edu.br.modelo;

import java.util.HashMap;
import java.util.Map;

public class CatalogoCursos {
	private static CatalogoCursos instancia;
	
	private Map<String, Curso> cursos;
	
	public static CatalogoCursos getCatalogo() {
		if(CatalogoCursos.instancia == null)
			CatalogoCursos.instancia = new CatalogoCursos();
		return CatalogoCursos.instancia;
	}
	
	private CatalogoCursos() {
		this.cursos = new HashMap<String, Curso>();
	}
	
	public void registrar(Curso curso) {
		this.cursos.put(curso.getCodigo(), curso);
	}
	
	public Curso recuperar(String codigo) {
		Curso curso = this.cursos.get(codigo);
		return (Curso) ((curso != null) ? curso.prototipar() : null); 
	}
	
}
