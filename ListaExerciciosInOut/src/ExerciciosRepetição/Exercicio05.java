/*
 * Crie um programa que leia um número do teclado até que encontre um
 * número igual a zero. No final, mostre a soma dos números
 * digitados.(DO...WHILE)
 */

package ExerciciosRepetição;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String args[]) {
		Scanner scan= new Scanner(System.in);
		int num, soma= 0;
		
		System.out.printf("Insira um número: ");
		num= scan.nextInt();
		
		do {
			soma += num;
			System.out.printf("Insira um número: ");
			num= scan.nextInt();
		}
		while (num != 0);
		
		System.out.printf("A soma total dos números inseridos é de: " + soma);
	}

}
