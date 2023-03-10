package Facade;

public class MinhaAplicacaoEstoque{
	
	private Produto sis1;
	private ItemEstoque sis2;
	private FacadeEstoque sis3;
	
	public MinhaAplicacaoEstoque(){
		sis1 = new Produto();
		sis2 = new ItemEstoque();
		sis3 = new FacadeEstoque();
	}
	
	public void metodoA() {
		sis1.metodoUm(); //Sistema Produto
		sis2.metodoDois(); //Sistema Item Estoque
		sis3.metodoTres(); //Sistema Facade Estoque
	}
	
	public void metodoB() {
		sis3.metodoTres(); //Sistema Facade Estoque
		sis2.metodoDois(); //Sistema Item Estoque
		sis1.metodoUm(); //Sistema Produto
	}
	
	public static void main(String[] args){
		
		MinhaAplicacaoEstoque facade = new MinhaAplicacaoEstoque();
		
		facade.metodoB();
    }
}