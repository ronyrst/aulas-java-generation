/*
 * Para doar sangue é necessário ter entre 18 e 69 anos de idade.
 * Pessoas com idade entre 60 e 69 anos, só podem doar se não for a sua primeira doação. 
 * 
 * Escreva um Algoritmo em Java que obtenha via teclado o nome do doador (String), 
 * a idade (inteiro) do doador e se é a primeira doação (boolean). 
 * 
 * De acordo com as Regras para a doação, mostre na tela se o doador está Apto ou 
 * Não Apto para doar sangue. Veja os exemplos abaixo:
 */

package exercicios_if;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean primeiraDoacao, podeDoar = false;
		
		System.out.println("Entre com o nome do doador: ");
		leia.skip("\\R?");
		nome = leia.nextLine();
		
		System.out.println("Entre com a idade do doador: ");
		idade = leia.nextInt();
		
		System.out.println("É a primeira doação dessa pessoa? ");
		primeiraDoacao = leia.nextBoolean();
		
		if( idade >= 18 && idade < 60 ) {
			podeDoar = true;
		}
		else if( idade >= 60 && idade <= 69 ) {
			if(primeiraDoacao == false) {
				podeDoar = true;
			}
		}
		
		
		if (podeDoar == true)
			System.out.println(nome + " pode doar sangue!");
		else
			System.out.println(nome + " não pode doar sangue.");
	}

}
