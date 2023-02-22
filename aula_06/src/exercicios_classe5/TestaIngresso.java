package exercicios_classe5;

public class TestaIngresso {

	public static void main(String[] args) {
		Ingresso ingresso1 = new Ingresso("Fantasma da Ópera", 149.99f, "28 de Fevereiro de 2023", "21:00", "C32");
		
		ingresso1.visualizar();
		
		Ingresso ingresso2 = new Ingresso("Rogério e seus Teclados", 20.0f, "25 de Fevereiro de 2023", "18:00", "G18");
		
		ingresso2.visualizar();

	}

}
