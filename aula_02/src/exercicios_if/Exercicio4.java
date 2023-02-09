/*
 * Escreva um algoritmo em Java, que leia 3 palavras (String), 
 * que definem as características de um tipo de animal possível 
 * segundo o diagrama abaixo, que deve ser lido da esquerda para a direita.
 */

package exercicios_if;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String vertebrado, classeAnimal, alimentacao;
		
		
		System.out.println("O animal é vertebrado ou invertebrado?");
		leia.skip("\\R?");
		vertebrado = leia.nextLine();
		
		System.out.println("Qual a classe do animal? (ave, mamifero, inseto ou anelideo)");
		leia.skip("\\R?");
		classeAnimal = leia.nextLine();
		
		System.out.println("Qual o tipo de alimentação do animal? (carnivoro, onivoro, herbivoro ou hematofago)");
		leia.skip("\\R?");
		alimentacao = leia.nextLine();
		
		
		if(vertebrado.equalsIgnoreCase("vertebrado")) {
			
			if(classeAnimal.equalsIgnoreCase("ave")) {
				if(alimentacao.equalsIgnoreCase("carnivoro"))
					System.out.println("O animal é uma Águia.");
				else if(alimentacao.equalsIgnoreCase("onivoro"))
					System.out.println("O animal é um Pombo.");
			}
			else if(classeAnimal.equalsIgnoreCase("mamifero")){
				if(alimentacao.equalsIgnoreCase("onivoro"))
					System.out.println("O animal é um Humano.");
				else if(alimentacao.equalsIgnoreCase("herbivoro"))
					System.out.println("O animal é uma Vaca.");
			}
		}
		else if(vertebrado.equalsIgnoreCase("invertebrado")) {
			if(classeAnimal.equalsIgnoreCase("inseto")) {
				if(alimentacao.equalsIgnoreCase("hematofago"))
					System.out.println("O animal é uma Pulga.");
				else if(alimentacao.equalsIgnoreCase("herbivoro"))
					System.out.println("O animal é uma Lagarta.");
			}
			else if(classeAnimal.equalsIgnoreCase("anelideo")){
				if(alimentacao.equalsIgnoreCase("hematofago"))
					System.out.println("O animal é um Sanguessuga.");
				else if(alimentacao.equalsIgnoreCase("onivoro"))
					System.out.println("O animal é uma Minhoca.");
			}
		}	
	}
}
