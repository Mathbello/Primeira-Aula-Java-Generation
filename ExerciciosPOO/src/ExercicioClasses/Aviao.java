package ExercicioClasses;

public class Aviao {
	//Declarando Atributos do objeto
	private String modelo;
	private int capacidadePessoas;
	private String piloto;
	private String destino;
	
	//Método construtor
	public Aviao (String modelo, int capacidadePessoas, String piloto, String destino) {
		this.modelo= modelo;
		this.capacidadePessoas= capacidadePessoas;
		this.piloto= piloto;
		this.destino= destino;
	}
	
	public void fichaVoo( ) {
		System.out.println("..:: Ficha do Voo Programado\nPiloto: " + piloto + "\nModelo do avião: " + modelo + "\nDestino: " + destino);
	}
	
	public void mudarPiloto(String piloto) {
		this.piloto= piloto;
		System.out.println("Piloto alterado");
	}
	
	
}
