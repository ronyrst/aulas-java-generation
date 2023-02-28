package exercicios_classe2.model;

public class Gerente extends Funcionario {
	
	private String loja;

	public Gerente(String nome, float salario, String dataProximasFerias, String dataContratacao,
			String numeroCarteiraTrabalho, String loja) {
		super(nome, salario, dataProximasFerias, dataContratacao, numeroCarteiraTrabalho);
		this.loja = loja;
	}

	public String getLoja() {
		return loja;
	}

	public void setLoja(String loja) {
		this.loja = loja;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Loja: " + this.loja);
		System.out.println("");
	}

}
