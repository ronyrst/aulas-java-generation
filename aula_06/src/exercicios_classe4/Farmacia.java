package exercicios_classe4;

public class Farmacia {
	private String nomeProduto;
	private String fabricante;
	private float preco;
	private String foto;
	private long lote;
	
	public Farmacia(String nomeProduto, String fabricante, float preco, String foto, long lote) {
		this.nomeProduto = nomeProduto;
		this.fabricante = fabricante;
		this.preco = preco;
		this.foto = foto;
		this.lote = lote;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public long getLote() {
		return lote;
	}

	public void setLote(long lote) {
		this.lote = lote;
	}
	
	public void visualizar() {
		System.out.println("*********************");
		System.out.println("  Farmácia do Povão  ");
		System.out.println("*********************");
		System.out.println("Produto:       " + this.nomeProduto);
		System.out.println("Fabricante:    " + this.fabricante);
		System.out.println("Foto:          " + this.foto);
		System.out.println("Preço:         R$ " + this.preco);
		System.out.println("Lote:          " + this.lote);
		System.out.println("");	
	}
}
