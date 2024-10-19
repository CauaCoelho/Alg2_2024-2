package aula6questao1;

abstract class Conta {
	
	protected Double saldo;
	
	public Conta(Double saldo) {
		super();
		this.saldo = saldo;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public abstract void sacarSaldo(double valor);
	
	public void depositarSaldo(double valor) {
		saldo += valor;
	}
}
