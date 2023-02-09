/*
 * Com base na tabela abaixo, escreva um algoritmo em Java que leia o código de um item
 * (número inteiro de 1 a 6) e a quantidade comprada deste item (número inteiro).
 * 
 *  A seguir, mostre na tela o valor total da conta e o nome do produto que foi comprado.
 */

package exercicios_switch;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###.##");
		Scanner leia = new Scanner(System.in);
		
		int item, quantidade;
		
		System.out.println("Digite o número referente ao item que deseja comprar.");
		System.out.println("1. \tCachorro Quente");
		System.out.println("2. \tX-Salada");
		System.out.println("3. \tX-Bacon");
		System.out.println("4. \tBauru");
		System.out.println("5. \tRefrigerante");
		System.out.println("6. \tSuco de Laranja");
		item = leia.nextInt();
		
		System.out.println("Digite a quantidade comprada do item.");
		quantidade = leia.nextInt();
		
		switch(item) {
		case 1:
			System.out.println("Item: Cachorro Quente.");
			System.out.println("Total a pagar: R$ " + df.format(quantidade * 10.00));
			break;
		case 2:
			System.out.println("Item: X-Salada.");
			System.out.println("Total a pagar: R$ " + df.format(quantidade * 15.00));	
			break;
		case 3:
			System.out.println("Item: X-Bacon.");
			System.out.println("Total a pagar: R$ " + df.format(quantidade * 18.00));	
			break;
		case 4:
			System.out.println("Item: Bauru.");
			System.out.println("Total a pagar: R$ " + df.format(quantidade * 12.00));
			break;
		case 5:
			System.out.println("Item: Refrigerante.");
			System.out.println("Total a pagar: R$ " + df.format(quantidade * 8.00));
			break;
		case 6:
			System.out.println("Item: Suco de Laranja.");
			System.out.println("Total a pagar: R$ " + df.format(quantidade * 13.00));
			break;
		}
	}
}
