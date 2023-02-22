package exercicios_classe1;

public class Cliente {
	
	private String nome;
	private String cpf;
	private int mesa;
	private String comanda;
	private float conta;
	
	public Cliente(String nome, String cpf, int mesa, String comanda, float conta) {
		this.nome = nome;
		this.cpf = cpf;
		this.mesa = mesa;
		this.comanda = comanda;
		this.conta = conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return cpf;
	}

	public void setCPF(String cpf) {
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

	public void setConta(int conta) {
		this.conta = conta;
	}
	
	public void visualizar() {
		System.out.println("********************");
		System.out.println("  B A R  L A G O A  ");
		System.out.println("********************");
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Mesa: " + this.mesa);
		System.out.println("Comanda: " + this.comanda);
		System.out.println("Conta: " + this.conta);
		System.out.println("");

	}
}
