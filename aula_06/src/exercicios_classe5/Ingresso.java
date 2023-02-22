package exercicios_classe5;

public class Ingresso {
	
	private String nomeEspetaculo;
	private float valor;
	private String data;
	private String hora;
	private String cadeira;
	
	public Ingresso(String nomEspetaculo, float valor, String data, String hora, String cadeira) {
		this.nomeEspetaculo = nomEspetaculo;
		this.valor = valor;
		this.data = data;
		this.hora = hora;
		this.cadeira = cadeira;
	}

	public String getNomeEspetaculo() {
		return nomeEspetaculo;
	}

	public void setNomeEspetaculo(String nomeEspetaculo) {
		this.nomeEspetaculo = nomeEspetaculo;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getCadeira() {
		return cadeira;
	}

	public void setCadeira(String cadeira) {
		this.cadeira = cadeira;
	}
	
	public void visualizar() {
		System.out.println("***********************");
		System.out.println("   Beth Casa de Shows  ");
		System.out.println("***********************");
		System.out.println("*** I N G R E S S O ***");
		System.out.println("***********************");
		System.out.println("Espetáculo:    " + this.nomeEspetaculo);
		System.out.println("Data:          " + this.data);
		System.out.println("Hora:          " + this.hora);
		System.out.println("Cadeira:       " + this.cadeira);
		System.out.println("Preço:         R$ " + this.valor);
		System.out.println("");	
	}
}
