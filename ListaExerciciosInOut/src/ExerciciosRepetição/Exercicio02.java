/*
 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
 */

package ExerciciosRepeti��o;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String args[]) {
		int i, num, par= 0, impar= 0;
		Scanner scan= new Scanner(System.in);
		
		for (i= 0; i<10; i++) {
			System.out.printf("Digite um n�mero: ");
			num= scan.nextInt();
			
			if(num%2 == 0) {
				par++;
			}
			else {
				impar++;
			}
		}
		
		System.out.println("Voc� digitou " + par + " n�meros pares e " + impar + " n�meros �mpares.");
	}

}
