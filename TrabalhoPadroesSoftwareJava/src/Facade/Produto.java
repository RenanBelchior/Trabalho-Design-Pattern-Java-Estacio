package Facade;

public class Produto {
	
	private long codigo;
	private String nome;
	private double valor;
	
	public void metodoUm() 
	{
		System.out.println("Sistema Produtos");
	}
	
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}