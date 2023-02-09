/*
 * Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e 
 * imprima na tela se a soma de A + B é maior, menor ou igual a C.
*/

package exercicios_if;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a, b, c, soma;
		
		System.out.println("Entre com o número A: ");
		a = leia.nextInt();
		
		System.out.println("Entre com o número B: ");
		b = leia.nextInt();
		
		System.out.println("Entre com o número C: ");
		c = leia.nextInt();
		
		soma = a + b;
		
		if(soma == c)
			System.out.println("A soma de A + B (" + soma + ") é igual a C (" + c + ").");
		else if(soma < c)
			System.out.println("A soma de A + B (" + soma + ") é menor que C (" + c + ").");
		else if(soma > c)
			System.out.println("A soma de A + B (" + soma + ") é maior que C (" + c + ").");
	}

}
