/*
 * Desenvolva um algoritmo em Java para uma conta bancária. 
 *
 * O programa deverá ler o tipo de operação a ser realizada com
 * base na tabela abaixo (número inteiro entre 1 e 3) e o
 * valor a ser depositado ou sacado (somente nas opções 2 e 3). 
 * Considere que um saque só pode ser realizado caso haja saldo suficiente. 
 * 
 * Ao final de cada operação, exiba o novo Saldo na tela. 
 * 
 * A variável saldo (float), será inicializada com o valor de R$ 1000.00. 
 * 
 * Caso a operação seja diferente do intervalo 1 a 3, mostre a mensagem Operação Inválida!
*/

package exercicios_switch;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int operacao;
		float saldo = 1000f, deposito = 0f, saque = 0f;
		
		System.out.println("Digite a operação desejada: ");
		operacao = leia.nextInt();
		
		if (operacao == 2) {
			System.out.println("");
			System.out.printf("Saldo disponível: R$ %.2f \n", saldo);
			System.out.println("");
			System.out.println("Digite o valor para sacar:");
			saque = leia.nextFloat();
		}
		else if(operacao == 3) {
			System.out.println("");
			System.out.println("Digite o valor a depositar:");
			deposito = leia.nextFloat();			
		}
		
		System.out.println("");
		
		switch(operacao) {
		case 1:
			System.out.println("Operação - Saldo");
			break;
		case 2:
			System.out.println("Operação - Saque");
			
			if(saque > saldo)
				System.out.println("Saldo insuficiente.");
			else {
				saldo = saldo - saque;
				System.out.print("Novo ");				
			}
			break;
		case 3:
			System.out.println("Operação - Deposito");
			saldo += deposito;
			System.out.print("Novo ");
			break;
		default:
			System.out.println("Operação Inválida.");
		}
		
		System.out.printf("Saldo disponível: R$ %.2f", saldo);
	}
}