/*
 * Escreva um programa Java para criar uma Collection ArrayList de Objetos 
 * da Classe String. O programa deverá solicitar ao usuário, que ele digite 
 * via teclado 5 cores e deverá adicioná-las individualmente no ArrayList. 
 * 
 * Em seguida, faça o que se pede:
 * Mostre na tela todas as cores que foram adicionadas. 
 * Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.
 */


package exercicios_collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<String>();
		Scanner leia = new Scanner(System.in);
		String novaCor;
		int contagem = 0;
		
		while(contagem < 5) {
			System.out.println("Entre com a cor que deseja adicionar:");
			leia.skip("\\R?");
			novaCor = leia.nextLine();
			
			cores.add(novaCor);
			contagem += 1;
		}
		
		System.out.println("\nCores adicionadas: ");
		for(var cor: cores)
			System.out.println(cor);
		
		cores.sort(null);
		System.out.println("\nEm ordem crescente, cores adicionadas: ");
		for(var cor: cores)
			System.out.println(cor);
	}
}
