package exercicios_classe1.model;

public class PessoaJuridica extends Cliente {
	
	private String cnpj;
	private String produtos;
	private float vencimentos;
	
	public PessoaJuridica(String nome, String cnpj, String produtos, float vencimentos) {
		super(nome);
		this.cnpj = cnpj;
		this.produtos = produtos;
		this.vencimentos = vencimentos;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getProdutos() {
		return produtos;
	}

	public void setProdutos(String produtos) {
		this.produtos = produtos;
	}

	public float getVencimentos() {
		return vencimentos;
	}

	public void setVencimentos(float vencimentos) {
		this.vencimentos = vencimentos;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("CNPJ: " + this.cnpj);
		System.out.println("Produtos: " + this.produtos);
		System.out.println("Vencimentos: " + this.vencimentos);
		System.out.println("");
	}
}
