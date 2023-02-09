/*
 * Com base na tabela abaixo, escreva um algoritmo em Java, 
 * que simule uma Calculadora simples. O programa deverá ler dois números float: numero1 e numero2,
 * e na sequência ler o Código da operação matemática (número inteiro de 1 a 4).
 * 
 * A seguir, mostre na tela o resultado da operação entre os 2 números.
 * Caso a operação seja diferente do intervalo 1 a 4, mostre a mensagem Operação Inválida!
*/

package exercicios_switch;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float numero1, numero2;
		int operacaoMatematica;
		
		System.out.println("Digite o primeiro número:");
		numero1 = leia.nextFloat();
		
		System.out.println("Digite o segundo número:");
		numero2 = leia.nextFloat();
		
		System.out.println("Entre com a operação matemática desejada:");
		operacaoMatematica = leia.nextInt();
		
		switch(operacaoMatematica) {
		case 1:
			System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
			break;
		case 2:
			System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
			break;			
		case 3:
			System.out.println(numero1 + " * " + numero2 + " = " + (numero1 * numero2));
			break;
		case 4:
			if(numero2 == 0) {
				System.out.println("Divisão por zero é indeterminada.");
				break;
			}
			System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
			break;
		default:
			System.out.println("Operação matemática inválida.");
			break;
		}
	}
}
