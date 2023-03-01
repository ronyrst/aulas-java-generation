/*
Faça um programa que leia um valor T e preencha um vetor 
N[1000] com a sequência de valores de 0 até T-1 
repetidas vezes, conforme exemplo abaixo. 
Imprima o vetor N.

Entrada
A entrada contém um valor inteiro T (2 ≤ T ≤ 50).

Saída
Para cada posição do vetor, escreva "N[i] = x", 
onde i é a posição do vetor e x é o valor 
armazenado naquela posição.
 */

package lista4VetorMatriz;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[] n = new int[1000];
		int t, contador = 0;
		
		t = leia.nextInt();
		
		for(int i = 0; i < 1000; i++) {
			if(contador == t) {
				contador = 0;
				n[i] = contador;
				contador += 1;
			} else {
				n[i] = contador;
				contador += 1;
			}
			
			System.out.println("N[" + i + "] = " + n[i]);
		}
	}
}