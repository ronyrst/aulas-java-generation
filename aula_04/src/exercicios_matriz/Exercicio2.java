/*
 * Elabore um algoritmo que leia as notas de uma classe com 10
 * participantes durante 4 bimestres de um ano. 
 * As 4 notas de cada participante serão armazenadas 
 * em uma linha de uma matriz de números reais, 
 * logo cada linha da matriz serão as notas de um participante. 
 * Em um vetor de números reais, armazene as médias de cada 
 * participante e exiba as médias de cada um na tela.
 */


package exercicios_matriz;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float[][] matriz = new float[10][4];
		float[] medias = new float[10];
		float somaMedia = 0;
		
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz[linha].length; coluna++) {
				System.out.println("Entre com a " + (coluna + 1) + "ª nota do aluno " + (linha+1) + ".");
				matriz[linha][coluna] = leia.nextFloat();
			}
		}
		leia.close();
		
		// Em um vetor de números reais, armazene as médias de cada 
		// participante e exiba as médias de cada um na tela.
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz[linha].length; coluna++)
				somaMedia += matriz[linha][coluna];
			
			medias[linha] = somaMedia/(float)matriz[linha].length;
			System.out.println("\n\nA média do aluno " + (linha + 1) + " é: ");
			System.out.print(medias[linha]);
			
			somaMedia = 0;
		}
	}
}
