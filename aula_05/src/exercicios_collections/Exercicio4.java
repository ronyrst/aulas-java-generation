/*
 * Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer, 
 * inicializada com 10 numeros inteiros. 
 * 
 * O programa deverá solicitar ao usuário, que ele digite via teclado 1 
 * número inteiro e caso ele seja encontrado no Set, exiba na tela a mensagem: 
 * Número 00 Encontrado! 
 * 
 * Caso o número não seja encontrado, ele deverá exibir 
 * na tela a mensagem: O número NN não foi encontrado!
 */

package exercicios_collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio4 {

	public static void main(String[] args) {
		Set<Integer> numeros = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);
		int testeNumero;
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println("Entre com o número para saber se está na lista: ");
		testeNumero = leia.nextInt();
		
		if(numeros.contains(testeNumero))
			System.out.println("O número " + testeNumero + " foi encontrado.");
		else
			System.out.println("O número " + testeNumero + " não foi encontrado.");

	}

}
