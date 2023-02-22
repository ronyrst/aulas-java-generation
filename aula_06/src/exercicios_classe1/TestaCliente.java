package exercicios_classe1;

public class TestaCliente {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Julin", "12345678910", 2, "1 Coca", 6.0f);
		
		cliente1.visualizar();
		
		Cliente cliente2 = new Cliente("Juliano", "23456789101", 1, "1 Coxinha, 1 Suco natural", 11.0f);
		
		cliente2.visualizar();

	}

}
