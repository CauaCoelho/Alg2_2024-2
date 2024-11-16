package excecao;

public class Eletronico extends Item {
	
	private String marca;
	
	public Eletronico(String nome, Double preco, String marca) {
		super(nome, preco);
		marca=this.marca;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	@Override
	public String toString() {
		return super.toString() + "(Marca: " + marca + ")";
	}
	
}
