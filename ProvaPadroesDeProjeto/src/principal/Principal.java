package principal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import ifba.edu.br.builder.ExercicioBuilder;
import ifba.edu.br.modelo.Equipamento;
import ifba.edu.br.modelo.Exercicio;
import ifba.edu.br.modelo.GrupoMuscular;
import ifba.edu.br.modelo.TipoExercicio;
import ifba.edu.br.singleton.CatalogoEquipamentos;
import ifba.edu.br.singleton.TipoEquipamento;

public class Principal {
	
	
	private void Questao1(String nomeArquivo) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, FileNotFoundException, IOException {
		CatalogoEquipamentos ce = CatalogoEquipamentos.getCatalogoEquipamento();
		Equipamento eq;
		eq = ce.novaInstancia("ACESSORIO01", TipoEquipamento.Halter, 5);
		eq = ce.novaInstancia("ACESSORIO01", TipoEquipamento.Halter, 5);
		eq = ce.novaInstancia("MaqO01", TipoEquipamento.Maquina, 5);
		System.out.println(eq.getQuantidade());
	}
	
	public void Questao2() {
		try {
			
			
			
			CatalogoEquipamentos ce = CatalogoEquipamentos.getCatalogoEquipamento();
			Equipamento barra = ce.novaInstancia("Barra1", TipoEquipamento.Acessorio, 1);
			Equipamento  halter = ce.novaInstancia("halter1", TipoEquipamento.Halter, 5);
			
			
			Exercicio exercicio = ExercicioBuilder.getInstancia()
					.reset()
					.setDescricao("Rosca Direta")
					.setEquipamento(halter)
					.setEquipamento(barra)
					.setGrupoMuscular(GrupoMuscular.Biceps)
					.setGrupoMuscular(GrupoMuscular.Costa).
					setTipoExercicio(TipoExercicio.Resistido)
					.build("APO1");
					
			System.out.println(exercicio);
			
					;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		Principal teste = new Principal();
		try {
			teste.Questao1("/classes.props");
			teste.Questao2();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
