/*
 * Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), 
 * via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos 
 * e o total de pessoas cuja idade seja maior que 50 anos. 
 * 
 * A leitura dos dados deve ser finalizada ao digitar uma idade negativa. Veja o exemplo abaixo:
*/

package exercicios_while;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int idade = 0, contador21 = 0, contador50 = 0;
		
		while(idade >= 0) {
			System.out.println("Entre com a idade da pessoa: ");
			idade = leia.nextInt();
			
			if(idade < 21 && idade > 0)
				contador21++;
			
			else if(idade > 50)
				contador50++;
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + contador21);
		System.out.println("Total de pessoas maiores de 50 anos: " + contador50);
	}
}
