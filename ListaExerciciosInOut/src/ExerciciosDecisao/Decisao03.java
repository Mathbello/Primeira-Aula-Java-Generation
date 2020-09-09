/*
 * Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
 * categoria ela se encontra:
 * 10-14 infantil
 * 15-17 juvenil
 * 18-25 adulto
 */

package ExerciciosDecisao;

import java.util.Scanner;

public class Decisao03 {
	public static void main(String args[]) {
		int idade;
		Scanner scan= new Scanner(System.in);
		
		System.out.printf("Digite sua idade: ");
		idade= scan.nextInt();
		
		if(idade>=10 && idade<15) {
			System.out.println("Você se encontra na categoria infantil.");
		}
		else if(idade>=15 && idade<18) {
			System.out.println("Você se encontra na categoria juvenil.");
		}
		else if(idade>=18 && idade<26) {
			System.out.println("Você se encontra na categoria adulto.");
		}
		else {
			System.out.println("Idade não categorizada.");
		}
	}

}
