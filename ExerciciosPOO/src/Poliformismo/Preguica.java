package Poliformismo;

public class Preguica extends Animal {

private String acao, som;
	
	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}
	
	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	Preguica () {
		
	}
	
	public String getNome() {
		return "A preguiça " +super.getNome()+ " que gosta de " + this.getAcao() + " faz " + this.getSom();
	}
}
