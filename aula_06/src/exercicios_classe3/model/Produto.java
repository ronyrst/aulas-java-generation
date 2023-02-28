package exercicios_classe3.model;

public class Produto {
	private String nomeJogo;
	private String plataforma;
	private String distribuidora;
	private float preco;
	private String lancamento;
	
	public Produto(String nomeJogo, String plataforma, String distribuidora, float preco, String lancamento) {
		this.nomeJogo = nomeJogo;
		this.plataforma = plataforma;
		this.distribuidora = distribuidora;
		this.preco = preco;
		this.lancamento = lancamento;
	}

	public String getNomeJogo() {
		return nomeJogo;
	}

	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getDistribuidora() {
		return distribuidora;
	}

	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public String getLancamento() {
		return lancamento;
	}

	public void setLancamento(String lancamento) {
		this.lancamento = lancamento;
	}
	
	public void visualizar() {
		System.out.println("********************");
		System.out.println(" L E V I  G A M E S ");
		System.out.println("********************");
		System.out.println("Jogo:          " + this.nomeJogo);
		System.out.println("Distribuidora: " + this.distribuidora);
		System.out.println("Plataforma:    " + this.plataforma);
		System.out.println("Lançamento:    " + this.lancamento);
		System.out.println("Preço:         " + this.preco);
		System.out.println("");
	}
}
