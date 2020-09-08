/*
 * Um sistema de equa��es lineares do tipo: ax+by=c; dx+ey=f.
 * Pode ser resolvido conforme mostrado abaixo:
 * x= (ce-bf)/(ae-bd)
 * y= (af-cd)/(ae-bd)
 * Escreva um sistema que l� os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y.
 */

package Exercicios;
import java.text.Format;
import java.util.Scanner;

public class ExercicioSete {
	public static void main(String args[]) {
		int a, b, c, d, e, f;
		float x, y;
		Scanner scan= new Scanner(System.in);
		
		System.out.printf("Insira o valor de A: ");
		a= scan.nextInt();
		System.out.printf("Insira o valor de B: ");
		b= scan.nextInt();
		System.out.printf("Insira o valor de C: ");
		c= scan.nextInt();
		System.out.printf("Insira o valor de D: ");
		d= scan.nextInt();
		System.out.printf("Insira o valor de E: ");
		e= scan.nextInt();
		System.out.printf("Insira o valor de F: ");
		f= scan.nextInt();
		
		x = ((c*e) - (b*f)) / ((a*e) - (b*d));
		y = ((a*f) - (c*d)) / ((a*e) - (b*d));
		
		System.out.println("O valor de X � " + x);
		System.out.println("O valor de Y � " + y);
	}

}
