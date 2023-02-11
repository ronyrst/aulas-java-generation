/*
 * Escreva um algoritmo em Java, que leia números inteiros via teclado, 
 * até que o número zero seja digitado. 
 * 
 * Ao final, mostre na tela a soma de todos os números digitados, 
 * que sejam positivos. Veja o exemplo abaixo: 
 * 
*/

package exercicios_dowhile;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero, soma = 0;
		
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if(numero > 0)
				soma += numero;
		} while(numero != 0);
		
		System.out.println("A soma dos números positivos é: " + soma);
	}
}
