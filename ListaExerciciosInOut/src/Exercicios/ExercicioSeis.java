/*
 * Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano,
 * P(x1, y1) e P(x2, y2), escreva a dist�ncia entre eles. A f�rmula que efetua tal c�lculo �
 * d= rais quadrada ((x2-x1)^2 + (y2-y1)^2)
 */

package Exercicios;
import java.util.Scanner;

public class ExercicioSeis {
	public static void main(String args[]) {
		float x1, x2, y1, y2;
		double D;
		Scanner scan= new Scanner(System.in);
		
		System.out.printf("Digite o valor de x1: ");
		x1= scan.nextFloat();
		System.out.printf("Digite o valor de x2: ");
		x2= scan.nextFloat();
		System.out.printf("Digite o valor de y1: ");
		y1= scan.nextFloat();
		System.out.printf("Digite o valor de y2: ");
		y2= scan.nextFloat();
		
		D= Math.sqrt((Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2)));
				
		System.out.println("O resultado �: " + D);
	}

}
