package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###.##");
		Scanner leia = new Scanner(System.in);
		
		int numero = 10;
		String nome = "Rony dos Santos";
		double area = 45.28523852593285;
		
		
		System.out.println("Digite um número inteiro: ");
		numero = leia.nextInt();
		
		System.out.println("Digite um nome: ");
		leia.skip("\\R?");
		nome = leia.nextLine();
		
		System.out.println("Digite um número real: ");
		area = leia.nextDouble();
		
		
		System.out.println("O nome da pessoa participante é: " + nome);
		System.out.println("Essa pessoa é nota " + numero);
		System.out.printf("Essa é a área %.2f \n", area);
		System.out.println("A área é " + df.format(area));
		
		
	}

}
