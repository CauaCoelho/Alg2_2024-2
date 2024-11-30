package aula11RevisaoQuestao1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Scanner para reconhecer a entrada
		Scanner scan = new Scanner(System.in);
		
		Cliente cliente = new Cliente("Gabriel", "OPensador@gmail.com", "0632345678");
		
		Pedido pedido1 = new Pedido("KH", cliente, 150);
		
		Email email = new Email ();
		Sms sms = new Sms();
		
		System.out.println("Escolha a forma de receber sua notificacao:"
				+ " 1 para email e 2 para sms");
		
		switch (scan.nextInt()){
		case 1: 
			email.enviarNotificacao(cliente);
			email.mostrarConteudo(pedido1);
			break;
		case 2:
			sms.enviarNotificacao(cliente);
			sms.mostrarConteudo(pedido1);
			break;
		default:
			System.out.println("Forma inválida!");
		}
		
		
		

	}

}
