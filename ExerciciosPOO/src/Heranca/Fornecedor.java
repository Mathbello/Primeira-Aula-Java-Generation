package Heranca;

import java.text.NumberFormat;

public class Fornecedor extends Pessoa {
	private float valorCredito;
	private float valorDivida;
	
	public Fornecedor(String nome, String endereco, String CPF, int idade, int telefone, float valorCredito, float valorDivida) {
		super (nome, endereco, CPF, idade, telefone);
		this.valorCredito= valorCredito;
		this.valorDivida= valorDivida;
	}

	public float getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(float valorCredito) {
		this.valorCredito = valorCredito;
	}

	public float getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(float valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public float obterSaldo() {
		float saldo= getValorCredito() - getValorDivida();
		return saldo;
	}
	
	public String formatSaldo() {
		NumberFormat newSaldo= NumberFormat.getCurrencyInstance();
		newSaldo.setMinimumFractionDigits(2);
		String formatoReal= newSaldo.format(obterSaldo());
		return formatoReal;
	}
	
	public void getInfo() {
		System.out.println("O fornecedor " +getNome()+ " está com um saldo " + formatSaldo() + " em conta.");
	}
	

}
