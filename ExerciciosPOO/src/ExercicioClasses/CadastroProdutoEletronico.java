package ExercicioClasses;

import java.util.Scanner;

public class CadastroProdutoEletronico {
	public static void main(String args[]) {
		//Criando Objeto
		ProdutoEletronico produto1= new ProdutoEletronico("Sony", "Controle PlayStation", 350.00);
		ProdutoEletronico produto2= new ProdutoEletronico("Xbox", "Controle Xbox One", 350.00);
		ProdutoEletronico produto3= new ProdutoEletronico("JBL", "Caixa de som", 190.00);
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Digite a marca: ");
		String marca= scan.next();
		System.out.println("Digite produto: ");
		String produto= scan.next();
		System.out.println("Digite o valor: ");
		float valor= scan.nextFloat();
		
		ProdutoEletronico produto4= new ProdutoEletronico(marca, produto, valor);
		
		
		//Criando Array para mostrar como lista
		Object[] vetor= {produto1, produto2, produto3, produto4};
		
		for(Object i : vetor) {
			((ProdutoEletronico) i).getInfo();
			System.out.println("---------------------");
		}
		
	}
}
