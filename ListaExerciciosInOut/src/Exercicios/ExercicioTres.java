/*
 * Faça um sistema que leia a idade de uma pessoa expressa em anos, 
 * meses e dias e mostre-a expressa apenas em dias
 */

package Exercicios;

import java.util.Scanner;

public class ExercicioTres {
	public static void main (String args[]) {
		
		int tempo, min, hora, seg;
		Scanner scan= new Scanner(System.in);
		
		System.out.printf("Coloque o tempo do evento em segundos: ");
		tempo= scan.nextInt();
		
		hora= tempo / 3600;
		min= (tempo % 3600) / 60;
		seg= (tempo % 3600) % 60;
		
		System.out.println("O evento durou " +hora+ " hora(s), " +min+ " minuto(s) e " +seg+ " segundo(s).");
		
	}
}
