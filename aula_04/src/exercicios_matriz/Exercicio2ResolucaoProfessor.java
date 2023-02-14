package exercicios_matriz;

import java.util.Scanner;

public class Exercicio2ResolucaoProfessor {

	public static void main(String[] args) {
		
		float matriz[][] = new float[3][4];
		float media[] = new float[3];
		int soma = 0;
		Scanner leia = new Scanner(System.in);
		
		for(int linha = 0; linha < matriz.length; linha ++) {
			for(int coluna = 0; coluna < matriz[linha].length; coluna ++) {
				System.out.println("Digite a nota: ");
				matriz[linha][coluna] = leia.nextFloat();
			}
		}
		leia.close();
		
		for(int linha = 0; linha < matriz.length; linha ++) {
			for(int coluna = 0; coluna < matriz[linha].length; coluna ++) {
				
				soma += matriz[linha][coluna];
			}
			
			media[linha] = (float)soma / matriz[linha].length;
			soma = 0;
		}
		
		for(var medias: media)
			System.out.println(medias);
	}
}
