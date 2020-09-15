/*
 * Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros
 * inteiros. O programa deve executar os seguintes passos:
 * (a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
 * (b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es
 * A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
 * (c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100.
 * (d) Mostre na tela cada valor do vetor A, um em cada linha.
 */

package ExerciciosVetor;

public class Exercicio01 {
	public static void main(String args[]) {
		int[] A= {1, 0, 5, -2, -5, 7};
		int soma;
		
		soma= A[0] + A[1] + A[5];
		
		A[3]= 100;
		
		System.out.println("A soma das posi��es 0, 1 e 5 �: " + soma + ".\n");
		
		//For each usado para percorrer o vetor
		for(int i : A) {
			System.out.println("["+i+"]");
		}
		
		/*for(int i= 0; i<6; i++) {
			System.out.println("A posi��o "+ i + " � " +A[i]);
		}*/
	}

}
