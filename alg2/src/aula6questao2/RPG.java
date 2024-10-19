package aula6questao2;

public class RPG {

	public static void main(String[] args) {
		Mago mago = new Mago("Patolino");
		Guerreiro guerreiro = new Guerreiro("Conan");

		mago.atacar();
		guerreiro.atacar();
	}

}
