package exercicios_classe2;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario("Robertin", 1600.0f, "01/08/23", "17/03/2019", "1233344566773");
		
		func1.visualizar();
		
		Funcionario func2 = new Funcionario("Cláudia", 2300.0f, "23/11/23", "06/07/2021", "3313551361311");
		
		func2.visualizar();
	}

}
