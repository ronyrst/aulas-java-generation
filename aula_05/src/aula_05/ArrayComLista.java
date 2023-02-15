package aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayComLista {

	public static void main(String[] args) {
		
		ArrayList<Double> notas = new ArrayList<Double>();
		Scanner leia = new Scanner(System.in);
		
		int opcao = 0;
		double nota = 0;
		
		do {
			System.out.println("1. Cadastrar nota");
			System.out.println("2. Listar todas as notas");
			System.out.println("3. Buscar uma notas");
			System.out.println("4. Apagar uma notas");
			System.out.println("5. Alterar uma nota");
			System.out.println("6. Sair");
			System.out.println("Digite a opção desejada");
			opcao = leia.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("Digite uma nota entre 1 a 10");
				nota = leia.nextDouble();
				break;
			case 2:
				System.out.println("Listar todas as Notas");
				if(notas.isEmpty())
					System.out.println("Base de dados vazia.");
				else
					notas.forEach(System.out::println);
				
				break;
			case 3:
				System.out.println("Procurar uma Nota");
				System.out.println("Digite a Nota: ");
				nota = leia.nextDouble();
				System.out.println("A nota " + nota + " existe? " + notas.contains(nota));
				
				System.out.println("O índice da minha nota é: " + notas.indexOf(nota));
				break;
			case 4: 
				System.out.println("Remover uma Nota");
				System.out.println("Digite a Nota: ");
				nota = leia.nextDouble();
				notas.remove(nota); // Aqui passa a nota propriamente dita
				
				// notas.remove(notas.indexOf(nota)); // Apaga usando o índice do objeto				
				break;
			case 5:
				System.out.println("Atualizar uma Nota");
				System.out.println("Digite a nota a ser alterada: ");
				nota = leia.nextDouble();
				System.out.println("Digite a nova nota: ");
				double notaNova = leia.nextDouble();
				notas.set(notas.indexOf(nota), notaNova); // Atualizando uma nota
				
				break;
			case 6:
				System.out.println("Fim do programa.");
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}
			
			
		}while(opcao != 6);
		
		/* 
		notas.add(9.0);
		notas.add(8.0);
		notas.add(7.0);
		
		for(var valor: notas)
			System.out.println(valor);
		*/
	}

}
