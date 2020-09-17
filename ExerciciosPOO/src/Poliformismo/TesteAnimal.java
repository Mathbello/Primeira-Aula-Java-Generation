package Poliformismo;

public class TesteAnimal {
	public static void main(String args[]) {
		Cachorro cachorro= new Cachorro();
		cachorro.setNome("Bilu");
		cachorro.setAcao("correr");
		cachorro.setSom("au au au");
		
		Cavalo cavalo= new Cavalo();
		cavalo.setNome("Horse");
		cavalo.setAcao("correr");
		cavalo.setSom("Ihihihi, Ihihihi");
		
		Preguica preguica= new Preguica();
		preguica.setNome("Sid");
		preguica.setAcao("subir em árvores");
		preguica.setSom("Kiiiii, kiiiii");
		
		System.out.println(cachorro.getNome());
		System.out.println();
		System.out.println(cavalo.getNome());
		System.out.println();
		System.out.println(preguica.getNome());
		
		
	}
}
