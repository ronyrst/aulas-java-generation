/*
 * Escreva um algoritmo em Java, que leia um número inteiro via teclado 
 * e mostre na tela uma mensagem indicando se este número é par ou ímpar 
 * e se o número é positivo ou negativo. Veja os exemplos abaixo:
 * 
*/

package exercicios_if;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite o número a ser testado: ");
		numero = leia.nextInt();
		
		if(numero >= 0) {
			if(numero%2 == 0) 
				System.out.println("O Número é positivo e par.");
			else
				System.out.println("O número é positivo e ímpar.");
		}
		else {
			if(numero%2 == 0) 
				System.out.println("O Número é negativo e par.");
			else
				System.out.println("O número é negativo e ímpar.");
		}
	}
}
