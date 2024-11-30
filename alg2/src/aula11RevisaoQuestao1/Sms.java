package aula11RevisaoQuestao1;

public class Sms extends Notificacao{
	@Override
	public void enviarNotificacao (Cliente cliente) {
		System.out.println("- Enviado por SMS para: " + cliente.getNumeroTelefone());
	}
	public void mostrarConteudo(Pedido pedido) {
		System.out.println("Informações do pedido: "
				 + "\n Código: " + pedido.getCodigo() 
				 + "\n Valor: " + pedido.getValor() 
				 + "\n Cliente: " + pedido.getCliente());
		
	}
}
