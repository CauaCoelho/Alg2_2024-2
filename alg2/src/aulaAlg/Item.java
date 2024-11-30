package aulaAlg;

public class Item {
	private String nome;
	private String modelo;
	private Integer dano;
	private Integer defesa;
	
	public Item(String nome, String modelo, Integer dano, Integer defesa) {
		this.nome = nome;
		this.modelo = modelo;
		this.dano = dano;
		this.defesa = defesa;
	
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public Integer getDano() {
		return dano;
	}
	
	public void setDano(Integer dano) {
		this.dano = dano;
	}
	
	public Integer getDefesa() {
		return defesa;
	}
	
	public void setDefesa(Integer defesa) {
		this.defesa = defesa;
	}
	
	
		
}
