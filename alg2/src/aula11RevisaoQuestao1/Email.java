package aula11RevisaoQuestao1;

public class Email extends Notificacao{
	@Override
	public void enviarNotificacao(Cliente cliente) {
		System.out.println("- Enviado por E-mail para: " + cliente.getEmail());
	}
	public void mostrarConteudo(Pedido pedido) {
		System.out.println("Informações do pedido: "
				 + "\n Código: " + pedido.getCodigo() 
				 + "\n Valor: " + pedido.getValor() 
				 + "\n Cliente: " + pedido.getCliente());
		
	}
}
