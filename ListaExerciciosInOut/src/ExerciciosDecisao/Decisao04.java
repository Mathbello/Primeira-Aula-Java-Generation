/*
 * Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
 * n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
 * �mpar exiba o n�mero elevado ao quadrado.
 */

package ExerciciosDecisao;

import java.util.Scanner;
import java.text.DecimalFormat; //Biblioteca para formatarDecimal

public class Decisao04 {
	public static void main(String args[]) {
		double N;
		Scanner scan= new Scanner(System.in);
		
		System.out.printf("Digite qualquer valor inteiro: ");
		N= scan.nextDouble();
		
		if(N % 2 == 0) {
			//Usando biblioteca para formata��o das casas decimais
			System.out.println("O n�mero " + N + " � par e sua ra�z � " + new DecimalFormat("###.###").format(Math.sqrt(N)));
			//Usando nota��o para chamar a vari�vel
			System.out.printf("O n�mero %.3f � par e sua ra�z � %.3f", N, Math.sqrt(N));
		}
		else {
			System.out.println("O n�mero " + N + " � �mpar e seu quadrado �: " + new DecimalFormat("###.###").format(Math.pow(N, 2)));
			System.out.printf("O n�mero %.3f � �mpar e seu quadrado � %.3f", N, Math.pow(N, 2));
		}
	}

}
