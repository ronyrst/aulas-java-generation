package aula_09;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
	
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println("\nExemplo - Método Map");
		
		List<Integer> numerosAoCubo = numeros.stream()
				.map(x -> x*x*x)
				.collect(Collectors.toList());
		
		System.out.println("\nNúmeros elevados ao Cubo: " + numerosAoCubo);
		
		List<Integer> numerosPares = numeros.stream()
				.filter(x -> x%2 == 0)
				.collect(Collectors.toList());

		System.out.println("\nNúmeros pares: " + numerosPares);
		// ====
		
		List<Integer> numerosDesordenados = Arrays.asList(6,5,1,7,2,3,9,4,5,10);
		
	}

}
