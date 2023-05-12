package principal;

import ifba.edu.br.builder.CursoBuilder;
import ifba.edu.br.factory.CursoFactory;
import ifba.edu.br.factory.Factory;
import ifba.edu.br.factory.FactorySwitch;
import ifba.edu.br.modelo.CatalogoCursos;
import ifba.edu.br.modelo.Curso;
import ifba.edu.br.modelo.Disciplina;
import ifba.edu.br.modelo.Livro;
import ifba.edu.br.modelo.Produto;
import ifba.edu.br.modelo.TipoProduto;

public class Principal {
	
	public void questao1() {
		Factory fac;
		try {
			fac = FactorySwitch.getFactory(TipoProduto.Livro);
			Produto livro = fac.getProduto("01", "Desing Patters");
			fac = FactorySwitch.getFactory(TipoProduto.Disciplina);
			Produto disciplina = fac.getProduto("inf011", "Padrões de Projetos");
			fac = FactorySwitch.getFactory(TipoProduto.Curso);
			Produto curso = fac.getProduto("201", "Analise e desenvolvimeto de sistemas");
			System.out.println(livro);
			System.out.println(disciplina);
			System.out.println(curso);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void questao2() {
		Factory fac;
		
		try {
			fac = FactorySwitch.getFactory(TipoProduto.Livro);
			Produto livro = fac.getProduto("livro1", "Padrão de projetos gang of 4");
			fac = FactorySwitch.getFactory(TipoProduto.Disciplina);
			Produto disciplina1 = fac.getProduto("inf032", "Programação Web");
			Produto disciplina2 = fac.getProduto("inf011", "Padrão de projetos");
			
			Curso curso = CursoBuilder.factory().
					setNome("Analise e dessenolvimento de sistemas").
					setCodigo("201").
					addLivro((Livro) livro).
					addDisciplina((Disciplina) disciplina1).
					addDisciplina((Disciplina) disciplina2).
					build();
				System.out.println(curso);
				System.out.println(curso.getLivros().get(0).toString());
				System.out.println(curso.getDisciplinas().get(0).toString());
				System.out.println(curso.getDisciplinas().get(1).toString());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void questao3() {
		Factory fac;
		
		
		try {
			fac = FactorySwitch.getFactory(TipoProduto.Livro);
			Produto livro = fac.getProduto("livro1", "Padrão de projetos gang of 4");
			fac = FactorySwitch.getFactory(TipoProduto.Disciplina);
			Produto disciplina1 = fac.getProduto("inf032", "Programação Web");
			Produto disciplina2 = fac.getProduto("inf011", "Padrão de projetos");
			
			Curso curso = CursoBuilder.factory().
					setNome("Analise e dessenolvimento de sistemas").
					setCodigo("201").
					addLivro((Livro) livro).
					addDisciplina((Disciplina) disciplina1).
					addDisciplina((Disciplina) disciplina2).
					build();
			
			CatalogoCursos.getCatalogo().registrar(curso);
			Curso cursoB = CatalogoCursos.getCatalogo().recuperar("201");
			cursoB.setCodigo("202");
			curso.setNome("Mudeia o nome");
			System.out.println(cursoB);
			CatalogoCursos.getCatalogo().registrar(cursoB);
			System.out.println(curso);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		Principal principal = new Principal();
		principal.questao3();
		
	}
}
