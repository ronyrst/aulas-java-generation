/*
 * Com base na tabela abaixo, escreva um algoritmo em Java que leia o Nome do Colaborador (String),
 * o Código do Cargo do Colaborador (número inteiro de 1 a 6) e o Salário (número float).
 * A seguir, mostre na tela o Nome do Colaborador, o Cargo e o novo Salário reajustado.
*/

package exercicios_switch;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#####.##");
		Scanner leia = new Scanner(System.in);
		
		String nome, cargoNome = "";
		int codigoCargo;
		float salario, reajuste = 0;

		System.out.println("Entre com o nome do colaborador: ");
		leia.skip("\\R?");
		nome = leia.nextLine();
		
		System.out.println("Entre com o cargo do colaborador: ");
		codigoCargo = leia.nextInt();
		
		System.out.println("Entre com o salário atual do colaborador: ");
		salario = leia.nextFloat();
		
		switch(codigoCargo) {
		case 1:
			cargoNome = "Gerente";
			reajuste = 0.1f;
			break;
		case 2:
			cargoNome = "Vendedor";
			reajuste = 0.07f;
			break;
		case 3:
			cargoNome = "Supervisor";
			reajuste = 0.09f;
			break;
		case 4:
			cargoNome = "Motorista";
			reajuste = 0.06f;
			break;
		case 5:
			cargoNome = "Estoquista";
			reajuste = 0.05f;
			break;
		case 6:
			cargoNome = "Técnico de TI";
			reajuste = 0.08f;
			break;
		}
		
		System.out.println("Nome do colaborador: " + nome);
		System.out.println("Cargo: " + cargoNome);
		System.out.println("Salário reajustado: " + df.format(salario + (salario * reajuste)));
	}
}
