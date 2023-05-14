package principal;


import br.ifba.edu.builder.BuilderPedido;
import br.ifba.edu.builder.BuilderPratoFeito;
import br.ifba.edu.factory.Factory;
import br.ifba.edu.factory.FactoryBebida;
import br.ifba.edu.factory.FactorySwtich;
import br.ifba.edu.factory.TipoPrato;
import br.ifba.edu.modelo.Bebida;
import br.ifba.edu.modelo.Pedido;
import br.ifba.edu.modelo.Prato;
import br.ifba.edu.modelo.PratoFeito;
import br.ifba.edu.modelo.TipoCulinaria;
import br.ifba.edu.singleton.CatalogoPedidos;

public class Principal {
	
	public void Questao1() {
		Factory fac = FactorySwtich.selectFactory(TipoPrato.Bebida);
		
		CatalogoPedidos catalogo = CatalogoPedidos.getInstancia();
		
		Prato bebida = fac.getPrato("bebida", "12");
		
		 ((Bebida) bebida).setPreco(12);
		
		PratoFeito pf = BuilderPratoFeito.factory().
				reset().setCodigo("1").
				setNome("Prato feito simple").
				setDescricao("Prato feito simples com arroz, feijão, frango e vinagrete").
				setPreco(20).
				setTempoDePreparo(10).
				setTipoCulinaria(TipoCulinaria.Brasileira).build();
		
		Pedido pedido = BuilderPedido.factory().addPrato(pf)
				.addPrato(bebida).
				setCodigo("1").
				setNome("Bebida e pf").build();
		catalogo.cadastrar(pedido);
		System.out.println(pedido.getPreco());
		
	}
	
	public static void main(String[] args) {
		
	Principal	principal = new Principal();
	principal.Questao1();

	}
}
