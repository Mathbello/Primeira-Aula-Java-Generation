/*
 * Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.
 */

package Exercicios;

import java.util.Scanner;

public class ExercicioDois {
	public static void main (String args[]) {
		
		int idade, anos, meses, dias;
		Scanner scan= new Scanner(System.in);
		
		System.out.printf("Digite quantos dias de vida voc� acha que tem: ");
		idade= scan.nextInt();
		
		anos= idade / 365;
		meses= (idade % 365) / 30;
		dias= (idade % 365) % 365;
		
		System.out.println("Voc� tem " +anos+ " anos, " +meses+ " meses e " +dias+ " dias de vida.");
		
	}
}
