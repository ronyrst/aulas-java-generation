package exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.println("Digite o Salário Bruto: ");
		salarioBruto = leia.nextFloat();

		System.out.println("Digite o Adicional Noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Digite as Horas Extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Digite os Descontos: ");
		descontos = leia.nextFloat();
		
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		System.out.println("O Salário Líquido é: " + salarioLiquido);

	}

}
