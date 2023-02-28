package exercicios_classe2.model;

public abstract class Funcionario {
	
	private String nome;
	private float salario;
	private String dataProximasFerias;
	private String dataContratacao;
	private String numeroCarteiraTrabalho;
	
	public Funcionario(String nome, float salario, String dataProximasFerias, String dataContratacao,
			String numeroCarteiraTrabalho) {
		this.nome = nome;
		this.salario = salario;
		this.dataProximasFerias = dataProximasFerias;
		this.dataContratacao = dataContratacao;
		this.numeroCarteiraTrabalho = numeroCarteiraTrabalho;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getDataProximasFerias() {
		return dataProximasFerias;
	}

	public void setDataProximasFerias(String dataProximasFerias) {
		this.dataProximasFerias = dataProximasFerias;
	}

	public String getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(String dataContratacao) {
		this.dataContratacao = dataContratacao;
	}

	public String getNumeroCarteiraTrabalho() {
		return numeroCarteiraTrabalho;
	}

	public void setNumeroCarteiraTrabalho(String numeroCarteiraTrabalho) {
		this.numeroCarteiraTrabalho = numeroCarteiraTrabalho;
	}

	public void visualizar() {
		System.out.println("********************");
		System.out.println("  B A R  L A G O A  ");
		System.out.println("********************");
		System.out.println("Nome do colaborador: " + this.nome);
		System.out.println("Número da Carteira de Trabalho: " + this.numeroCarteiraTrabalho);
		System.out.println("Data de contratação: " + this.dataContratacao);
		System.out.println("Próximas férias: " + this.dataProximasFerias);
		System.out.println("Salário: " + this.salario);
	}
}
