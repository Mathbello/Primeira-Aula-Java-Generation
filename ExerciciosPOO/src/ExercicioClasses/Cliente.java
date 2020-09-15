package ExercicioClasses;

public class Cliente {
	//Declaração de Atributos
	private String nomeCliente;
	private int CPF;
	private String formaPagamento;
	private String planoContratado;
	
	//Método construtor
	public Cliente (String nomeCliente, int CPF, String formaPagamento, String planoContratado) {
		this.nomeCliente= nomeCliente;
		this.CPF= CPF;
		this.formaPagamento= formaPagamento;
		this.planoContratado= planoContratado;
	}
	
	//Métodos da Classe
	public void mostrarFormaPag() {
		System.out.println("O cliente " + nomeCliente + " tem como forma de pagamento preferida " + formaPagamento);
	}
	
	public void mostrarCadastro() {
		System.out.println("Cliente: " + nomeCliente + "\nPlano Contratado: " + planoContratado + "\nForma de Pagamento: " + formaPagamento);
	}
	
	public void mudarPlano(String planoContratado) {
		this.planoContratado= planoContratado;
	}
}
