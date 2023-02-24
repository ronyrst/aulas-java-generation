package exercicios_classe1.model;

public abstract class Cliente {
	
	private String nome;
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void visualizar() {
		System.out.println("********************");
		System.out.println("  B A R  L A G O A  ");
		System.out.println("********************");
		System.out.println("Nome: " + this.nome);
	}
}
