package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, mediaFinal;
		
		System.out.println("Digite a Nota número 1: ");
		nota1 = leia.nextFloat();

		System.out.println("Digite a Nota número 2: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite a Nota número 3: ");
		nota3 = leia.nextFloat();
		
		System.out.println("Digite a Nota número 4: ");
		nota4 = leia.nextFloat();
		
		
		mediaFinal = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("A média final é: " + mediaFinal);
	}
}