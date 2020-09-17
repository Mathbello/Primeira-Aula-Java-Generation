package Heranca;

public class Pessoa {
	private String nome;
	private String endereco;
	private String CPF;
	private int idade;
	private int telefone;
	
	public Pessoa(String nome, String endereco, String CPF, int idade,int telefone) {
		super();
		this.nome= nome;
		this.endereco= endereco;
		this.CPF= CPF;
		this.idade= idade;
		this.telefone= telefone;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getCPF() {
		return CPF;
	}


	public void setCPF(String cPF) {
		CPF = cPF;
	}


	public int getTelefone() {
		return telefone;
	}


	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
