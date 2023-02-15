/*
 * Escreva um programa Java contendo uma Collection Stack (Pilha) de Objetos da Classe String,
 * para organizar a retirada de livros em uma pilha. O programa deverá ter um Menu que 
 * aceitará as opções 0, 1, 2 e 3:
 * 1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro.
 * 2: Listar todos os livros da Pilha
 * 3: Retirar um livro da pilha 
 * 0: O programa deve ser finalizado. 
 * Caso a pilha esteja vazia e o atendente tente retirar um livro da pilha, 
 * ele deverá informar que a pilha está vazia.
 */

package exercicios_fila_pilha;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Stack<String> pilhaLivros = new Stack<String>();
		Scanner leia = new Scanner(System.in);
		int menu;
		String novoLivro;
		
		System.out.println("*************************************************");
		System.out.println("");
		System.out.println("\t1. Adicionar novo livro.");
		System.out.println("\t2. Listar todos os livros.");
		System.out.println("\t3. Retirar livro.");
		System.out.println("\t0. Sair");
		System.out.println("");
		System.out.println("*************************************************");
		
		do {
			System.out.println("Digite a opção desejada: ");
			menu = leia.nextInt();
			
			System.out.println("\n\n");

			switch(menu) {
			case 1:
				System.out.println("Cadastro de Livro: ");
				System.out.println("Entre com o nome do novo Livro: ");
				leia.skip("\\R?");
				novoLivro = leia.nextLine();
				
				pilhaLivros.push(novoLivro);
				System.out.println("Livro adicionado.");
				
				break;
			case 2:
				
				if(!pilhaLivros.empty()) {
					System.out.println("Lista de Livros na pilha: ");
					for(var volume: pilhaLivros)
						System.out.println(volume);
				}
				else
					System.out.println("Não há Livros na pilha.");
				
				break;
			case 3:
				if(!pilhaLivros.empty()) {
					System.out.println("Retirando o Livro: ");
					System.out.println(pilhaLivros.pop());
				}
				else
					System.out.println("Não há Livros na pilha.");
				
				break;
			case 0:
				menu = 0;
				System.out.println("Programa finalizado.");
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}
			
			System.out.println("\n");
		}while(menu != 0);
		
		
		leia.close();

	}

}
