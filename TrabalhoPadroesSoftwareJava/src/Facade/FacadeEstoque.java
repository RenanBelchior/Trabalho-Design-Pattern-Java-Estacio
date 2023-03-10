package Facade;

public class FacadeEstoque {

	public void metodoTres() 
	{
		System.out.println("Sistema Facade Estoque, Adicionar, Remover e Consultar");
	}
	
	public void adicionaProduto(Produto p) {
		adicionaProduto(p);
	}
	
	public void removeProduto(Produto p) {
		removeProduto(p);
	}
	
	public void consultaProduto(long codigo, Produto p) {
		consultaProduto(codigo, p);
	}
}