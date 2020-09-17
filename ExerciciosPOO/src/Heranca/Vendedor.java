package Heranca;

public class Vendedor extends Pessoa{
	float valorDeVenda, comissao;
	
	public Vendedor (String nome, String endereco, String CPF, int idade, int telefone, float valorDeVenda, float comissao) {
		super (nome, endereco, CPF, idade, telefone);
		this.valorDeVenda= valorDeVenda;
		this.comissao= comissao;
	}

	public float getValorDeVenda() {
		return valorDeVenda;
	}

	public void setValorDeVenda(float valorDeVenda) {
		this.valorDeVenda = valorDeVenda;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	public void valorComissao() {
		float valorC= getValorDeVenda() * (getComissao()/100);
		System.out.println("O valor de comissão é: " + valorC);
	}
}
