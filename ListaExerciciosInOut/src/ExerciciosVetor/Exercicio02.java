/*
 * Fa�a um programa que receba 6 n�meros inteiros e mostre:
 * Os n�meros pares digitados;
 * A soma dos n�meros pares digitados;
 * Os n�meros �mpares digitados;
 * A quantidade de n�meros �mpares digitados.
 */

package ExerciciosVetor;

import java.util.Scanner;
import java.util.ArrayList; //Classe para criar uma vetor vazio que na verdade � uma lista

public class Exercicio02 {
	public static void main(String args[]) {
		Scanner scan= new Scanner (System.in);
		ArrayList<Integer> pares= new ArrayList(); //Instanciando o vetor vazio
		ArrayList<Integer> impares= new ArrayList();
		int[] vetor= new int[6];
		int i, somaPar= 0, countImpar= 0;
		
		
		
		for(i= 0; i<6; i++) {
			System.out.printf("Insira um valor: ");
			vetor[i]= scan.nextInt();
		}
		
		for(i= 0; i<6; i++) {			
			if(vetor[i]%2 == 0) {
				pares.add (vetor[i]); //Incluindo o dado no vetor vazio
				somaPar += vetor[i];
			}
			else {
				impares.add (vetor[i]);
				//countImpar++;
				
			}
		}
		
		System.out.println("\nOs n�meros pares digitados foram: " + pares);
		System.out.println("A soma dos n�meros pares �: " + somaPar);
		System.out.println("Os n�meros �pares digitados foram: " + impares);
		System.out.println("Foi digitados a quantidade de " + impares.size() + " n�meros �mpares.");
	}

}
