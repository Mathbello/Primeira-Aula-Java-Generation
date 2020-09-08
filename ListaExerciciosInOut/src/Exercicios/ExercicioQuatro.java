/*
 * Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão:
 * D= (R + S)/ 2
 * R= (A + B) ^ 2
 * S= (B + C) ^ 2 
 */

package Exercicios;
import java.util.Scanner;

public class ExercicioQuatro {
	public static void main(String args[]) {
		double A, B, C, D, R, S;
		Scanner scan= new Scanner(System.in);
	
		System.out.printf("Insira o valor de A: ");
		A= scan.nextFloat();
		System.out.printf("Insira o valor de B: ");
		B= scan.nextFloat();
		System.out.printf("Insira o valor de C: ");
		C= scan.nextFloat();
		
		R= Math.pow((A + B), 2);
		S= Math.pow((B + C), 2);
		D= (R + S) / 2;
		
		System.out.println("O resultado é: " + D);
	}
}
