package aula6questao2;

public class Guerreiro extends Personagem{

	public Guerreiro(String nome) {
		super(nome, 300, 40);
		
	}

	@Override
	public void atacar() {
		System.out.println("AAAAA, " + nome + " avança com tudo!");
		
	}
	
}
