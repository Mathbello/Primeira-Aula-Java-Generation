/*
 *Fa�a um sistema que leia a idade de uma pessoa expressa em anos, 
 *meses e dias e mostre-a expressa apenas em dias
 */

package Exercicios;
import java.util.Scanner;

public class ExercicioUm {
	public static void main(String args[]) {
		
		float idade;
		
		System.out.printf("Digite sua idade: ");
		Scanner scan= new Scanner(System.in);
		
		idade= scan.nextFloat();
		
		System.out.println("Sua idade em dias �: "+(idade*365));
		System.out.println("Sua idade em meses �: "+(idade*30));
		System.out.println("Sua idade em anos �: "+ idade);
		
		
	}
}
