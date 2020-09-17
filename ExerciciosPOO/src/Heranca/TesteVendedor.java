package Heranca;

import java.util.Scanner;

public class TesteVendedor {
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
		System.out.printf("Digite o valor da venda: ");
		float vendas= scan.nextFloat();
		System.out.printf("Digite quantos porcento de comissão: ");
		float comissao= scan.nextFloat();
		
		
		Vendedor vendedor= new Vendedor(nome, endereco, CPF, idade, telefone, vendas, comissao);
		vendedor.valorComissao();
	}
}
