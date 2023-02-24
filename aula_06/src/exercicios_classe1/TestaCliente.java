package exercicios_classe1;

import exercicios_classe1.model.PessoaFisica;
import exercicios_classe1.model.PessoaJuridica;

public class TestaCliente {

	public static void main(String[] args) {
		PessoaFisica pf1 = new PessoaFisica("Julin", "12345678910", 2, "1 Coca", 6.0f);
		pf1.visualizar();
		
		PessoaFisica pf2 = new PessoaFisica("Juliano", "23456789101", 1, "1 Coxinha, 1 Suco natural", 11.0f);
		pf2.visualizar();
		
		System.out.println("");
		
		PessoaJuridica pj1 = new PessoaJuridica("Pituca Frios", "12345", "Mortandela (36,00); Salame (51,00); Mussarela (47,00)", 3000.0f);
		pj1.visualizar();
		
		PessoaJuridica pj2 = new PessoaJuridica("Levi Pães", "23424", "Baguete kg (35,00)", -900.0f);
		pj2.visualizar();
	}

}
