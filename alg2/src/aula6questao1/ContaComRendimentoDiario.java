package aula6questao1;

public class ContaComRendimentoDiario extends Conta{
	
	private double taxaRendimento;
	
	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

	public ContaComRendimentoDiario(Double saldo, double taxaRendimento) {
		super(saldo);
		this.taxaRendimento = taxaRendimento;
	
	}

	private String usuario;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public void render() {
		saldo += saldo * taxaRendimento;
	}

	@Override
	public void sacarSaldo(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
		} else {
			System.out.println("Saldo insuficiente.");
		}
		
	}
}
