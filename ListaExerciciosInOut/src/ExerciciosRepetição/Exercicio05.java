/*
 * Crie um programa que leia um n�mero do teclado at� que encontre um
 * n�mero igual a zero. No final, mostre a soma dos n�meros
 * digitados.(DO...WHILE)
 */

package ExerciciosRepeti��o;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String args[]) {
		Scanner scan= new Scanner(System.in);
		int num, soma= 0;
		
		System.out.printf("Insira um n�mero: ");
		num= scan.nextInt();
		
		do {
			soma += num;
			System.out.printf("Insira um n�mero: ");
			num= scan.nextInt();
		}
		while (num != 0);
		
		System.out.printf("A soma total dos n�meros inseridos � de: " + soma);
	}

}
