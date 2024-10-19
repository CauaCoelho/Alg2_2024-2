package aula6questao2;

public class Mago extends Personagem{

	public Mago(String nome) {
		super(nome, 100, 120);
		
	}

	@Override
	public void atacar() {
		System.out.println("O mago é implácavel, logo, ele vence");
		
	}

}
