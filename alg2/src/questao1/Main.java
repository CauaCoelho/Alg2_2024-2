package questao1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Mtaheu");
		pessoa.setIdade(17);
		
		
		System.out.println(pessoa.getNome() + " " + pessoa.getIdade());
		
		pessoa.cumprimentar();
	}

}
