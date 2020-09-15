package ExercicioClasses;

public class FichaAviao {
	public static void main(String args[]) {
		//Criando objetos
		Aviao ficha1= new Aviao ("Boeing", 1200, "Chico", "Japão");
		Aviao ficha2= new Aviao ("AzulPlus", 500, "Creiço", "Tailândia");
		
		ficha1.fichaVoo();
		System.out.println();
		ficha2.fichaVoo();
		
		System.out.println("\n..:: Alterando  o piloto ::..");
		ficha1.mudarPiloto("Valentina");
		System.out.println("Ficha Atualizada\n");
		ficha1.fichaVoo();
	}
}
