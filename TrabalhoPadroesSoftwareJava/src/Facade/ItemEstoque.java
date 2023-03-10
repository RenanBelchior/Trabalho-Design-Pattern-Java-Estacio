package Facade;

public class ItemEstoque {

	private int qtde;
	private Produto p;
	private double valorMedio;
	
	public void metodoDois() 
	{
        System.out.println("Sistema Item Estoque");
    }
	
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	public Produto getP() {
		return p;
	}
	public void setP(Produto p) {
		this.p = p;
	}
	public double getValorMedio() {
		return valorMedio;
	}
	public void setValorMedio(double valorMedio) {
		this.valorMedio = valorMedio;
	}
}