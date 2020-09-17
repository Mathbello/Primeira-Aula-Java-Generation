package Poliformismo;

public class Cachorro extends Animal {
	
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

	Cachorro () {
		
	}
	
	public String getNome() {
		return "O cachorro " +super.getNome()+ " que gosta de " + this.getAcao() + " faz " + this.getSom();
	}
}
