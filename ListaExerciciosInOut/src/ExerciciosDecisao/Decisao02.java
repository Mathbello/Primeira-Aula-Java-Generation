/*
 * Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
 */

package ExerciciosDecisao;

import java.util.Scanner;

public class Decisao02 {
	public static void main(String args[]) {
		int vetor[]= new int[3], aux, i, j;
		Scanner scan= new Scanner(System.in);
		
		//Inser��o de valores
		for (i= 0; i<3; i++) {
			System.out.printf("Insira um valor inteiro: ");
			vetor[i]= scan.nextInt();
		}
		
		//Coloca��o em ordem crescente
		for (j= 0; j<3; j++) {
			for (i= 0; i<3-1; i++) {
				if (vetor[i] > vetor[i+1]) {
				aux= vetor[i];
				vetor[i]= vetor[i+1];
				vetor[i+1]= aux;
				}
			}
			
		}
		
		//Mostrando ao usu�rio
		for (i=0; i<3; i++) {
			System.out.printf("[%d]", vetor[i]);
		}
	}

}
