/*
 * Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
 * final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
 * 0(zero).(DO...WHILE)
 */

package ExerciciosRepeti��o;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String args[]) {
		Scanner scan= new Scanner(System.in);
		int num, soma= 0, count= 0;
		float media;
		
		System.out.printf("Insira um n�mero: ");
		num= scan.nextInt();
		
		do {
			if (num%3 == 0) {
				count++;
				soma += num;
			}
			
			System.out.printf("Insira um n�mero: ");
			num= scan.nextInt();
		}
		while(num != 0);
		
		media= soma / count;
		
		System.out.println("A m�dia dos m�ltiplos de 3 �: " + media);
	}

}
