/*
 * Solicitar a idade de v�rias pessoas e imprimir: Total de pessoas com menos de
 * 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
 * idade for =-99. (WHILE)
 */

package ExerciciosRepeti��o;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String args[]) {
		int i, idade= 0, menor= 0, maior= 0; 
		Scanner scan= new Scanner(System.in);
		
		while (idade != -99) {
			System.out.print("Digite sua idade: ");
			idade= scan.nextInt();
			
			if(idade < 21 && idade != -99) {
				menor++;
			}
			if(idade > 50) {
				maior++;
			}
		}
		
		System.out.println("O total de pessoas menores de 21 anos de idade � " + menor + " pessoas.");
		System.out.println("O total de pessoas maiores de 50 anos de idade � " + maior + " pessoas.");
	}

}
