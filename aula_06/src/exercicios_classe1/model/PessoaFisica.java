package exercicios_classe1.model;

public class PessoaFisica extends Cliente {	

	private String cpf;
	private int mesa;
	private String comanda;
	private float conta;

	public PessoaFisica(String nome, String cpf, int mesa, String comanda, float conta) {
		super(nome);
		this.cpf = cpf;
		this.mesa = mesa;
		this.comanda = comanda;
		this.conta = conta;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getMesa() {
		return mesa;
	}

	public void setMesa(int mesa) {
		this.mesa = mesa;
	}

	public String getComanda() {
		return comanda;
	}

	public void setComanda(String comanda) {
		this.comanda = comanda;
	}

	public float getConta() {
		return conta;
	}

	public void setConta(float conta) {
		this.conta = conta;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("CPF: " + this.cpf);
		System.out.println("Mesa: " + this.mesa);
		System.out.println("Comanda: " + this.comanda);
		System.out.println("Conta: " + this.conta);
		System.out.println("");
	}
}
