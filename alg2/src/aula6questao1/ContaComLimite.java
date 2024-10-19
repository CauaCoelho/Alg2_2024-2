package aula6questao1;

public class ContaComLimite extends Conta {
	private double limite;
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public ContaComLimite(Double saldo, double limite) {
		super(saldo);
		this.limite = limite;
	}

	private String usuario;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	@Override
	public void sacarSaldo(double valor) {
		if (saldo + limite >= valor) {
			saldo -= valor;
		} else {
			System.out.println("Saldo e limites insuficientes.");
		}
	}
}
