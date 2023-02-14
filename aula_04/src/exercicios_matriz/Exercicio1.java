/*
 * Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em seguida, mostre na tela:
 * Todos os elementos da Diagonal Principal
 * Todos os elementos da Diagonal Secundária
 * A Soma de todos os elementos da Diagonal Principal
 * A Soma de todos os elementos da Diagonal Secundária
 */


package exercicios_matriz;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		int somaPrincipal = 0, somaSecundaria = 0;
		
		for(int linha = 0; linha < matriz.length; linha++){
			for(int coluna = 0; coluna < matriz[linha].length; coluna++){
				System.out.println("Entre com o valor da posição [" + (linha + 1) + "][" + (coluna + 1) + "]");
				matriz[linha][coluna] = leia.nextInt();
			}
		}
		
		// Todos os elementos da Diagonal Principal
		// A Soma de todos os elementos da Diagonal Principal
		System.out.println("\n\nOs elementos da Diagonal Principal da matriz são:");
		for(int linha = 0; linha < matriz.length; linha++){
			for(int coluna = 0; coluna < matriz[linha].length; coluna++){
				
				if(linha == coluna) {
					somaPrincipal += matriz[linha][coluna];
					System.out.print(matriz[linha][coluna] + " ");
				}
				
			}
		}
		System.out.println("\n\n");
			
		System.out.println("Os elementos da Diagonal Secundária da matriz são:");
		for(int linha = 0; linha < matriz.length; linha++){
			for(int coluna = 0; coluna < matriz[linha].length; coluna++){
				
				if(linha + coluna == matriz.length - 1) {
					somaSecundaria += matriz[linha][coluna];
					System.out.print(matriz[linha][coluna] + " ");
				}
				
			}
		}
		System.out.println("\n\n");
		
		System.out.println("Soma de elementos da Diagonal Principal: " + somaPrincipal);
		System.out.println("Soma de elementos da Diagonal Secundária: " + somaSecundaria);
	}
}
