package aula6questao2;

abstract class Personagem {
	protected String nome;
	protected int hp;
	protected int sp;
	
	public Personagem(String nome, int hp, int sp) {
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
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getSp() {
		return sp;
	}
	public void setSp(int sp) {
		this.sp = sp;
	}
	
	public abstract void atacar();
}
