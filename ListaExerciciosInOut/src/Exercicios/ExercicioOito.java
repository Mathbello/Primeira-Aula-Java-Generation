/*
 * O custo ao consumidor de um carro novo � a soma do custo de f�brica 
 * com a percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica). 
 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
 * escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor
 */

package Exercicios;
import java.util.Scanner;

public class ExercicioOito {
	public static void main(String args[]) {
		double imposto, custoF, taxaD, valor;
		Scanner scan= new Scanner(System.in);
		
		System.out.printf("Qual o valor do ve�culo R$ ");
		valor= scan.nextDouble();
		
		imposto= valor * 0.45;
		taxaD= valor * 0.28;
		custoF= valor - taxaD - imposto;
		
		System.out.println("O imposto custa R$ " + imposto);
		System.out.println("A taxa da concession�ria � R$ " + taxaD);
		System.out.println("O custo real de fabrica��o � R$ " + custoF);
	}

}
