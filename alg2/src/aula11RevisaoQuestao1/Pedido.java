package aula11RevisaoQuestao1;

public class Pedido {
	private String codigo;
	private Cliente cliente;
	private Integer valor;
	
	public Pedido(String codigo, Cliente cliente, Integer valor) {
		super();
		this.codigo = codigo;
		this.cliente = cliente;
		this.valor = valor;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Integer getValor() {
		return valor;
	}
	
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	
	
}
