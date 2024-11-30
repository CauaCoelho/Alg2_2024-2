package aulaAlg;

public class Mago extends Personagem {

	public Mago(String nome, Integer hp, Integer sp) {
		super(nome, hp, sp);
		
	}
	@Override
	public void atacarAlvo(Personagem alvo) {
		System.out.println(getNome() + " lança magia em " + alvo);
	}
	@Override 
	public void equiparItem(Item item) {
		System.out.println(getNome() + " equipou o item: " + item.getNome() + "\nAtributos: " + item.getNome() 
			+  " | Modelo: " +item.getModelo() + " | Dano: " + item.getDano() + " | Defesa: " + item.getDefesa());
		
	}
	
}
