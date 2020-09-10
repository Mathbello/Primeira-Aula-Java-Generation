/*
 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 */

package ExerciciosRepetição;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String args[]) {
		int i, num, par= 0, impar= 0;
		Scanner scan= new Scanner(System.in);
		
		for (i= 0; i<10; i++) {
			System.out.printf("Digite um número: ");
			num= scan.nextInt();
			
			if(num%2 == 0) {
				par++;
			}
			else {
				impar++;
			}
		}
		
		System.out.println("Você digitou " + par + " números pares e " + impar + " números ímpares.");
	}

}
