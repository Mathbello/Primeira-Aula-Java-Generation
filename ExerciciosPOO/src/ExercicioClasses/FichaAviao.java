package ExercicioClasses;

public class FichaAviao {
	public static void main(String args[]) {
		//Criando objetos
		Aviao ficha1= new Aviao ("Boeing", 1200, "Chico", "Jap�o");
		Aviao ficha2= new Aviao ("AzulPlus", 500, "Crei�o", "Tail�ndia");
		
		ficha1.fichaVoo();
		System.out.println();
		ficha2.fichaVoo();
		
		System.out.println("\n..:: Alterando  o piloto ::..");
		ficha1.mudarPiloto("Valentina");
		System.out.println("Ficha Atualizada\n");
		ficha1.fichaVoo();
	}
}
