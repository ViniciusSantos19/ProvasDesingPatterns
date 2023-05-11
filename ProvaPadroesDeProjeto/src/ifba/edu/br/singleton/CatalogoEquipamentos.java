package ifba.edu.br.singleton;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import ifba.edu.br.builder.Builder;
import ifba.edu.br.factory.AcessorioFactory;
import ifba.edu.br.factory.EquipamentoFactory;
import ifba.edu.br.factory.HalterFactory;
import ifba.edu.br.factory.MaquinaFactory;
import ifba.edu.br.modelo.Equipamento;

public class CatalogoEquipamentos {
	
	private Map<String, Equipamento> equipamentos;
	private Map<TipoEquipamento, EquipamentoFactory> fabricas;
	
	private static CatalogoEquipamentos instancia = null;
	
	private CatalogoEquipamentos() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, FileNotFoundException, IOException {
		this.equipamentos = new HashMap<String, Equipamento>();
		this.fabricas = this.carregarFabricas();
	}
	
	public Equipamento novaInstancia(String id, TipoEquipamento tipo, int quantidade) {
		EquipamentoFactory factory = this.fabricas.get(tipo);
		Equipamento equipamento = this.equipamentos.get(id);
		
		if(equipamento == null) {
			equipamento = factory.getEquipamento(id, quantidade);
		}else {
			equipamento.aumentarQuantidade(quantidade);
		}
		
		String tipoEquipamento = equipamento.getClass().getSimpleName();
		
		
		
		if(!tipo.name().equalsIgnoreCase(tipoEquipamento)) {
			return null;
		}
		
		this.equipamentos.put(equipamento.getIdentificador(), equipamento);
		return equipamento;
		
	}
	
	public Map<TipoEquipamento, EquipamentoFactory> carregarFabricas() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, FileNotFoundException, IOException {
		HashMap<TipoEquipamento, EquipamentoFactory> fabricas = new HashMap<TipoEquipamento, EquipamentoFactory>();		
		
		fabricas.put(TipoEquipamento.Halter, this.criarFactory(TipoEquipamento.Halter));
		fabricas.put(TipoEquipamento.Acessorio, this.criarFactory(TipoEquipamento.Acessorio));
		fabricas.put(TipoEquipamento.Maquina, this.criarFactory(TipoEquipamento.Maquina));
			
		return fabricas;
	}
	
	private EquipamentoFactory criarFactory(TipoEquipamento tipo) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
	    switch (tipo) {
	        case Maquina:
	            return new MaquinaFactory();
	        case Acessorio:
	            return new AcessorioFactory();
	        case Halter:
	        	return new HalterFactory();
	        default:
	            throw new ClassNotFoundException("Factory não encontrada para o nome: " + tipo);
	    }
	}
	
	public static CatalogoEquipamentos getCatalogoEquipamento() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, FileNotFoundException, IOException {
		
		if(CatalogoEquipamentos.instancia == null) {
			CatalogoEquipamentos.instancia = new CatalogoEquipamentos();
		}
		return CatalogoEquipamentos.instancia;
	}
	
}
