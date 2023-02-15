package exercicios_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3Professor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>();
		int valor;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Entre com o número: ");
			valor = leia.nextInt();
			numeros.add(valor);
		}
		
		System.out.println("Sem Iterator");
		for(var num: numeros)
			System.out.println(num);
		
		Iterator<Integer> iNumeros = numeros.iterator();
		
		while(iNumeros.hasNext())
			System.out.println(iNumeros.next());
	}
}
