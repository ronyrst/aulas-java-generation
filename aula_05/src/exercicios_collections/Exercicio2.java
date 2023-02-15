/*
 * Escreva um programa Java para criar uma Collection ArrayList de Objetos da 
 * Classe Wrapper Integer, inicializada com 10 valores inteiros. 
 * 
 * O programa deverá solicitar ao usuário, que ele digite via teclado 
 * 1 número inteiro e caso ele seja encontrado no ArrayList, 
 * exiba na tela a posição deste número na Collection. 
 * 
 * Caso o número não seja encontrado, 
 * ele deverá exibir na tela a mensagem: 
 * O número NN não foi encontrado!
 */


package exercicios_collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		ArrayList<Integer> valores = new ArrayList<Integer>();
		Scanner leia = new Scanner(System.in);
		int testeNumero;
		
		valores.add(2);
		valores.add(5);
		valores.add(1);
		valores.add(3);
		valores.add(4);
		valores.add(9);
		valores.add(7);
		valores.add(8);
		valores.add(10);
		valores.add(6);
		
		System.out.println("Entre com o número para saber se está na lista: ");
		testeNumero = leia.nextInt();
		
		if(valores.contains(testeNumero))
			System.out.println("O número " + testeNumero + " está localizado na posição: " + valores.indexOf(testeNumero));
		else
			System.out.println("O número " + testeNumero + " não foi encontrado.");
	}
}
