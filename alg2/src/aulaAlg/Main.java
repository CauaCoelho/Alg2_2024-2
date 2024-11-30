package aulaAlg;

public class Main {
	
	public static void main (String[] args) {
		Mago mago = new Mago("Gandalf", 5, 15);
		Item espada = new Item ("Espada","ataque", 5,1);
		Balrog balrog = new Balrog("Balrog", 10, 10);
	
	
	mago.atacarAlvo(balrog);
	mago.equiparItem(espada);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
