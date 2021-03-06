/*
 * Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
 * psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
 * era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
 * (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
 * agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
 * pessoas, calcule e mostre: (WHILE)
 * o n�mero de pessoas calmas;
 * o n�mero de mulheres nervosas;
 * o n�mero de homens agressivos;
 * o n�mero de outros calmos;
 * o n�mero de pessoas nervosas com mais de 40 anos;
 * o n�mero de pessoas calmas com menos de 18 anos.
 */

package ExerciciosRepeti��o;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String args[]) {
		Scanner scan= new Scanner(System.in);
		int i= 0, idade, sexo, estado, pessoasC= 0, mulheresN= 0, homensA= 0, outrosC= 0, pessoasN= 0, calmosMenor= 0; 
		
		while (i < 150) {
			System.out.printf("\nDigite sua idade: ");
			idade= scan.nextInt();
			System.out.println("Entre com seu sexo\n1-Feminino | 2-Masculino | 3-Outros");
			sexo= scan.nextInt();
			System.out.println("Voc� se considera\n1-Calmx | 2-Nervosx | 3-Agressivx");
			estado= scan.nextInt();
			
			if(estado == 1) {
				pessoasC++;
			}
			
			if(sexo==1 && estado==2) {
				mulheresN++;
			}
			
			if(sexo==2 && estado==3) {
				homensA++;
			}
			
			if(sexo==3 && estado==1) {
				outrosC++;
			}
			
			if(idade>=40 && estado==2) {
				pessoasN++;
			}
			
			if(idade<18 && estado==1) {
				calmosMenor++;
			}
			
			i++;
		}
		
		System.out.println("\nO n�mero total de pessoas calmas �: " + pessoasC);
		System.out.println("O n�mero total de mulheres nervosas �: " + mulheresN);
		System.out.println("O n�mero total de homens agressivos �: " + homensA);
		System.out.println("O n�mero total de pessoas calmas de outra sexualidade �: " + outrosC);
		System.out.println("O n�mero total de pessoas nervosas com mais de 40 anos �: " + pessoasN);
		System.out.println("O n�mero total de pessoas calmas com menos de 18 anos �: " + calmosMenor);
	}

}
