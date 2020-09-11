package ExerciciosVetor;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String args[]) {
		Scanner scan= new Scanner (System.in);
		int i, j, num, op= 0;
		int[][] matriz1= new int [2][2];
		int[][] matriz2= new int [2][2];
		int[][] matrizSoma= new int [2][2];
		int[][] matrizSub= new int [2][2];
		
		for(i= 0; i<2; i++) {
			for(j= 0; j<2; j++) {
				System.out.printf("Insira um valor para a matriz 1: ");
				matriz1[i][j]= scan.nextInt();
				}
			}
		
		System.out.println();
		
		for(i= 0; i<2; i++) {
			for(j= 0; j<2; j++) {
				System.out.printf("Insira um valor para a matriz 2: ");
				matriz2[i][j]= scan.nextInt();
			}
		}
		
		System.out.printf("\n\nEscolha uma destas op��es\n1- Somar as duas matrizes;\n2- Subtrair a primeira da segunda;\n3- Adicionar uma constante as duas Matrizes;\n4- Imprimir as matrizes.\n\nSua op��o: ");
		op= scan.nextInt();
		
		switch(op) {
			case 1: 
				System.out.println();
				for(i= 0; i<2; i++) {
					for(j= 0; j<2; j++) {
						matrizSoma[i][j]= matriz1[i][j] + matriz2[i][j];
						}
					}
				
				for(i= 0; i<2; i++) {
					for(j= 0; j<2; j++) {
						System.out.printf("[%d]", matrizSoma[i][j]);
					}
					System.out.println();
				}
				
			break;
				
			case 2: 
				System.out.println();
				for(i= 0; i<2; i++) {
					for(j= 0; j<2; j++) {
						matrizSoma[i][j]= matriz1[i][j] - matriz2[i][j];
						}
					}
				
				for(i= 0; i<2; i++) {
					for(j= 0; j<2; j++) {
						System.out.printf("[%d]", matrizSub[i][j]);
					}
					System.out.println();
				}
			break;		
			
			case 3:
				System.out.println();
				System.out.printf("Insira um valor inteiro: ");
				num= scan.nextInt();
				
				//Soma valor inserido na matriz 1
				for(i= 0; i<2; i++) {
					for(j= 0; j<2; j++) {
						matriz1[i][j]= matriz1[i][j] + num;
					}
				}
				
				//Soma valor inserido na matriz 2
				for(i= 0; i<2; i++) {
					for(j= 0; j<2; j++) {
						matriz2[i][j]= matriz2[i][j] + num;
					}
				}
				
				//Mostra matriz1 somada
				System.out.println();
				for(i= 0; i<2; i++) {
					for(j= 0; j<2; j++) {
						System.out.printf("[%d]", matriz1[i][j]);
					}
					System.out.println();
				}
				
				//Mostra matriz2 somada
				System.out.println();
				for(i= 0; i<2; i++) {
					for(j= 0; j<2; j++) {
						System.out.printf("[%d]", matriz2[i][j]);
					}
					System.out.println();
				}
			break;
			
			case 4:
				System.out.println();
				for(i= 0; i<2; i++) {
					for(j= 0; j<2; j++) {
						System.out.printf("[%d]", matriz1[i][j]);
					}
					System.out.println();
				}
				
				System.out.println();
				for(i= 0; i<2; i++) {
					for(j= 0; j<2; j++) {
						System.out.printf("[%d]", matriz2[i][j]);
					}
					System.out.println();
				}
			break;
			
			default:
				System.out.println();
				System.out.printf("Op��o inv�lida, programa encerrado");
			break;				
		}
	}
}
