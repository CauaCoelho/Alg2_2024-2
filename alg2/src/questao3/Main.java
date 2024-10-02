package questao3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Calculadora numero1 = new Calculadora();
		Calculadora numero2 = new Calculadora();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escreva um número: ");
		numero1.setNumero1(scan.nextInt());
		
		System.out.println("Escreva o outro: ");
		numero2.setNumero2(scan.nextInt());
	
		System.out.println("Escolha");
	}
	
}
