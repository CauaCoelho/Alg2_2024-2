package aula6questao1;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(Double saldo) {
		super(saldo);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void sacarSaldo(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
		} else {
			System.out.println("Saldo insuficiente");
		}
		
	}
	
	
}
