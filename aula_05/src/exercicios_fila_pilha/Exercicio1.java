/*
Escreva um programa Java contendo uma Collection Queue (Fila) de Objetos da Classe String,
para organizar a ordem de chegada dos Clientes de um Banco. O programa deverá ter um Menu 
que aceitará as opções 0, 1, 2 e 3:
1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
2: Listar todos os Clientes na fila
3: Chamar (retirar) uma pessoa da fila 
0: O programa deve ser finalizado. 
Caso a fila esteja vazia, o programa deverá informar que a fila está vazia 
ao tentar retirar (chamar) um cliente da fila.
 */

package exercicios_fila_pilha;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Queue<String> filaBanco = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		int opcao;
		String novoCliente;
		
		do {
			System.out.println("\n\n");
			System.out.println("*************************************************");
			System.out.println("\n");
			System.out.println("\t1. Adicionar novo cliente.");
			System.out.println("\t2. Listar todos os clientes.");
			System.out.println("\t3. Chamar cliente para atendimento.");
			System.out.println("\t0. Sair");
			System.out.println("\n");
			System.out.println("*************************************************");
			System.out.println("Digite a opção desejada: ");
			opcao = leia.nextInt();
			
			System.out.println("\n\n");
			
			switch(opcao) {
			case 1:
				System.out.println("Cadastro de Cliente: ");
				System.out.println("Entre com o nome do novo Cliente: ");
				leia.skip("\\R?");
				novoCliente = leia.nextLine();
				
				filaBanco.add(novoCliente);
				System.out.println("Cliente adicionado.");
				
				break;
			case 2:
				
				if(!filaBanco.isEmpty()) {
					System.out.println("Clientes na fila: ");
					for(var cliente: filaBanco)
						System.out.println(cliente + " ");
				}
				else
					System.out.println("Não há Cliente aguardando.");
				
				break;
			case 3:
				System.out.println("Próximo no atendimento: ");
				if(!filaBanco.isEmpty())
					System.out.println(filaBanco.poll());
				else
					System.out.println("Não há Cliente aguardando.");
				
				break;
			case 0:
				opcao = 0;
				System.out.println("Programa finalizado.");
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}
		}while(opcao != 0);
		
		leia.close();
	}
}
