package questao4;

public class Main {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("Kurt Cobain");
		aluno.setA1(5.9);
		aluno.setA2(7.6);
		
		System.out.println("Nota de: " + aluno.getNome() + ": " + aluno.calcularMedia());
		System.out.println("Situação: " + aluno.verificarAprovacao());
	}
}
