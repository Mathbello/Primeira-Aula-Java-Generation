package ExercicioClasses;

public class ProdutoEletronico {
	private String marca;
	private String produto;
	private double valor;
	
	public ProdutoEletronico(String marca, String produto, double valor) {
		this.marca= marca;
		this.produto= produto;
		this.valor= valor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public void getInfo() {
		System.out.println("Marca: " +getMarca()+ "\nProduto: " +getProduto()+ "\nValor R$" + getValor());
	}
	
	
}
