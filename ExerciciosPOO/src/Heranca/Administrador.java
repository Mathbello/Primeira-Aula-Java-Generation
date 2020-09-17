package Heranca;

public class Administrador extends Pessoa {
	float ajudaDeCusto;
	
	public Administrador (String nome, String endereco, String CPF, int idade, int telefone, float ajudaDeCusto) {
		super (nome, endereco, CPF, idade, telefone);
		this.ajudaDeCusto= ajudaDeCusto;
	}

	public float getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(float ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	/*public float calculoPassagem(int dias) {
		final float passagem= (float) 4.40*2;
		float valor= (passagem * dias);
		return valor;
	}
	
	public float calculoVr(int dias) {
		final float custo= (float) 36.50;
		float valor= custo * dias;
		return valor;
	}*/
	
	public void beneficios() {
		System.out.println("Sua ajuda de custo de " + getAjudaDeCusto() + " é referente ao VR e VT");
	}
}
