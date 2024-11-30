package aulaAlg;

public class Personagem implements Atacavel, Equipavel{
	private String nome;
	private Integer hp;
	private Integer sp;
	
	
	public Personagem(String nome, Integer hp, Integer sp) {
		super();
		this.nome = nome;
		this.hp = hp;
		this.sp = sp;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getHp() {
		return hp;
	}
	public void setHp(Integer hp) {
		this.hp = hp;
	}
	public Integer getSp() {
		return sp;
	}
	public void setSp(Integer sp) {
		this.sp = sp;
	}

	@Override
	public void equiparItem(Item item) {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void atacarAlvo(Personagem alvo) {
		// TODO Auto-generated method stub
		
	}
	
}
