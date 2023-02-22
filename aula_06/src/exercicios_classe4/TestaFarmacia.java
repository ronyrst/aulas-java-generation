package exercicios_classe4;

public class TestaFarmacia {

	public static void main(String[] args) {
		Farmacia produtin = new Farmacia("Dorflex", "Sanofi", 8.00f, "https://farma22.vteximg.com.br/arquivos/ids/176468-1000-1000/Dorflex-300-35-50mg-10-comprimidos.jpg?v=637015114788500000", 1335354643);
		
		produtin.visualizar();
		
		Farmacia produtao = new Farmacia("Elseve - Shampoo Para Cacheado", "L'oréal", 17.60f, "https://m.media-amazon.com/images/I/71A2kfsgVoL._AC_SX679_.jpg", 974823423);
		
		produtao.visualizar();
		
	}
}
