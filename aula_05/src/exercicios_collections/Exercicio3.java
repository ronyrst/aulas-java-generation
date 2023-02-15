/*
 * Escreva um programa Java para criar uma Collection Set de Objetos 
 * da Classe Wrapper Integer. O programa deverá solicitar ao usuário, 
 * que ele digite via teclado 10 valores inteiros não repetidos e 
 * adicione-os individualmente na Collection Set. 
 * 
 * Em seguida, faça o que se pede:
 * Mostre na tela todos os elementos da Collection Set, utilizando a Classe Iterator. 
 * Veja o exemplo abaixo:
 */


package exercicios_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3 {

	public static void main(String[] args) {
		Set<Integer> numeros = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);
		int valor;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Entre com um número para adicioná-lo no Set: ");
			valor = leia.nextInt();
			numeros.add(valor);
		}
		leia.close();
		
		Iterator<Integer> iNumeros = numeros.iterator();
		
		System.out.println("Os valores disponíveis são os seguintes: ");
		while(iNumeros.hasNext())
			System.out.println(iNumeros.next());
	}
}