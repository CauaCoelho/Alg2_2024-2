package excecao;

public class Alimento extends Item{
	
	public Alimento(String nome, Double preco, String validade) {
		super(nome, preco);
		this.validade = validade;
	}

	private String validade;

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	@Override
	public String toString() {
		return "Alimento [validade=" + validade + "]";
	}


	
	
	
}
