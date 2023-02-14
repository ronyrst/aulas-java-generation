/*
 * Dado um vetor contendo 10 números inteiros não ordenados e não repetidos,
 * construa um algoritmo que consiga pesquisar dados no vetor, 
 * onde o usuário irá digitar um número e o programa deve exibir na tela 
 * a posição deste número no vetor. Caso o número não seja encontrado, 
 * a mensagem: “Não foi encontrado!” deve ser exibida na tela. Veja os exemplos abaixo:
 */

package exercicios_vetor;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int[] vetorNumeros = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int valorBusca, testagem = 0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o valor que deseja buscar no vetor: ");
		valorBusca = leia.nextInt();
		leia.close();
		
		for(int contador = 0; contador < vetorNumeros.length; contador++) {
			if(vetorNumeros[contador] == valorBusca) {
				System.out.println("O número buscado está na posição " + contador + " do vetor.");
				testagem = 1;
			}
		}
		
		if(testagem == 0)
			System.out.println("O número " + valorBusca + " não foi encontrado.");
	}
}
