package br.ifba.edu.singleton;

import java.util.HashMap;
import java.util.Map;

import br.ifba.edu.modelo.Pedido;

public class CatalogoPedidos {
	private Map<String, Pedido> pedidos;
	private static CatalogoPedidos instancia = null;
	
	public static CatalogoPedidos getInstancia() {
		if(CatalogoPedidos.instancia == null)
			CatalogoPedidos.instancia = new CatalogoPedidos();
		return CatalogoPedidos.instancia;
	}
	
	private CatalogoPedidos() {
		this.pedidos = new HashMap<String, Pedido>();
	}
	
	public void cadastrar(Pedido pedido) {
		this.pedidos.put(pedido.getCodigo(), pedido);
	}
	
	public Pedido getPedido(String coidgo) {
		Pedido pedido = this.pedidos.get(coidgo);
		if(pedido == null) {
			return null;
		}
		return (Pedido) pedido.clonar();
	}
	
}
