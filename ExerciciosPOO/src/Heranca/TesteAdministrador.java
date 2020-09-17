package Heranca;

import java.util.Scanner;

public class TesteAdministrador {
	public static void main (String args[]) {
		Scanner scan= new Scanner(System.in);
		
		System.out.printf("Digite o nome da pessoa: ");
		String nome= scan.next();
		System.out.printf("Digite o endereço: ");
		String endereco= scan.next();
		System.out.printf("Digite o CPF: ");
		String CPF= scan.next();
		System.out.printf("Digite a idade: ");
		int idade= scan.nextInt();
		System.out.printf("Digite o telefone: ");
		int telefone= scan.nextInt();
		System.out.printf("Digite da sua ajuda de custo: ");
		float ajudaDeCusto= scan.nextFloat();
		
		
		Administrador adm= new Administrador(nome, endereco, CPF, idade, telefone, ajudaDeCusto);
		adm.beneficios();
	}
}
