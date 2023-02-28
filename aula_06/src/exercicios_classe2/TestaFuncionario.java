package exercicios_classe2;

import exercicios_classe2.model.Gerente;
import exercicios_classe2.model.Vendedor;

public class TestaFuncionario {

	public static void main(String[] args) {
		Vendedor vendedor1 = new Vendedor("Robertin", 1600.0f, "01/08/2023", "17/03/2019", "1233344566773", 900.0f, "Noite");
		vendedor1.visualizar();
		
		Vendedor vendedor2 = new Vendedor("Fabiana", 1850.0f, "12/09/2023", "28/06/2017", "3242428101332", 1100.0f, "Tarde");
		vendedor2.visualizar();
		
		Gerente gerente1 = new Gerente("Cláudia", 2800.0f, "23/11/2023", "06/07/2021", "3313551361311", "Barra da Calça");
		gerente1.visualizar();
		
		Gerente gerente2 = new Gerente("Taudiene", 3100.0f, "14/03/2023", "21/11/2019", "2392428358323", "Avenida Riograndence");
		gerente2.visualizar();
	}
}
