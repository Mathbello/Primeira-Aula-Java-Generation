/*
 * Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. 
 * Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente
 */

package Exercicios;
import java.util.Scanner;

public class ExercicioCinco {
	public static void main(String args[]) {
		float n1, n2, n3, media;
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Digite a primeira nota: ");
		n1= scan.nextFloat();
		System.out.printf("Digite a segunda nota: ");
		n2= scan.nextFloat();
		System.out.printf("Digite a terceira nota: ");
		n3= scan.nextFloat();
		
		media= (((n1*2) + (n2*3) + (n3*5)) / (1+2+3));
		
		System.out.println("Sua m�dia foi: " + media);
	}
}
