package exercicios_classe2.model;

public class Vendedor extends Funcionario {

	private float comissao;
	private String escala;
	
	public Vendedor(String nome, float salario, String dataProximasFerias, String dataContratacao,
			String numeroCarteiraTrabalho, float comissao, String escala) {
		super(nome, salario, dataProximasFerias, dataContratacao, numeroCarteiraTrabalho);
		this.comissao = comissao;
		this.escala = escala;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

	public String getEscala() {
		return escala;
	}

	public void setEscala(String escala) {
		this.escala = escala;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Comissão: " + this.comissao);
		System.out.println("Escala: " + this.escala);
		System.out.println("");
	}
}
