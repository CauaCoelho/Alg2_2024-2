package questao4;

public class Aluno {
	 private String nome;
	 private double a1;
	 private double a2;
	 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getA1() {
		return a1;
	}
	public void setA1(double a1) {
		this.a1 = a1;
	}
	public double getA2() {
		return a2;
	}
	public void setA2(double a2) {
		this.a2 = a2;
	}
	 
	public double calcularMedia() {
		return (a1 + a2)/2;
	}
	
	public String verificarAprovacao() {
		double media = calcularMedia();
		
		if (media >= 7.0) {
			return nome + " está aprovado!";
		} else {
			return nome + " está reprovado!";
		}
	} 
	 
}
