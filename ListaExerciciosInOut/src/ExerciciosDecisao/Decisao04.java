/*
 * Faça um programa em que permita a entrada de um número qualquer e exiba se este
 * número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
 * ímpar exiba o número elevado ao quadrado.
 */

package ExerciciosDecisao;

import java.util.Scanner;
import java.text.DecimalFormat; //Biblioteca para formatarDecimal

public class Decisao04 {
	public static void main(String args[]) {
		double N;
		Scanner scan= new Scanner(System.in);
		
		System.out.printf("Digite qualquer valor inteiro: ");
		N= scan.nextDouble();
		
		if(N % 2 == 0) {
			//Usando biblioteca para formatação das casas decimais
			System.out.println("O número " + N + " é par e sua raíz é " + new DecimalFormat("###.###").format(Math.sqrt(N)));
			//Usando notação para chamar a variável
			System.out.printf("O número %.3f é par e sua raíz é %.3f", N, Math.sqrt(N));
		}
		else {
			System.out.println("O número " + N + " é ímpar e seu quadrado é: " + new DecimalFormat("###.###").format(Math.pow(N, 2)));
			System.out.printf("O número %.3f é ímpar e seu quadrado é %.3f", N, Math.pow(N, 2));
		}
	}

}
