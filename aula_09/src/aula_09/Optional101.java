package aula_09;

import java.util.Optional;

public class Optional101 {

	public static void main(String[] args) {
		String[] palavras = new String[10];

		palavras[2] = "Generation Brasil - Turma 61";
		
		Optional<String> checaNulo = Optional.ofNullable(palavras[5]);
		
		Optional<String> checaNulo2 = Optional.ofNullable(palavras[2]);
		
		if(checaNulo.isPresent()) {
			String palavra = palavras[5].toLowerCase();
			System.out.println(palavra);
		} else {
			System.out.println("Não existe nenhuma palavra nesta posição.");
		}
		
		System.out.println(checaNulo);
		System.out.println(checaNulo2);
		System.out.println(checaNulo2.isEmpty()); // retorna true ou false
		System.out.println(checaNulo2.get()); // não faz encapsulado, mas entrega o valor por si mesmo.
		
		
	}

}
