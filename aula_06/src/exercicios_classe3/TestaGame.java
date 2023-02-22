package exercicios_classe3;

public class TestaGame {

	public static void main(String[] args) {
		
		Produto joguinho = new Produto("Minecraft", "Nintendo Switch", "Microsoft", 280.0f, "11/05/2017");
		
		joguinho.visualizar();
		
		Produto outroJoguinho = new Produto("Metal Gear Solid 4", "Playstation 3", "Sony", 65.0f, "12/06/2008");
		
		outroJoguinho.visualizar();
		

	}

}
