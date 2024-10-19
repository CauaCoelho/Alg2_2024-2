package aula6questao1;

public class FintechMain {

	public static void main(String[] args) {
		ContaCorrente corrente = new ContaCorrente(100.0);
		ContaComLimite limite = new ContaComLimite(700.0, 1200.0);
		ContaComRendimentoDiario diario = new ContaComRendimentoDiario(350.0, 0.015);
		
		Double teste = diario.getSaldo();
		
		System.out.println(corrente.getSaldo());
		System.out.println(limite.getSaldo() + " e " + limite.getLimite());
		System.out.println(diario.getSaldo() + " e " + diario.getTaxaRendimento());
		
		for (int dias = 0; dias < 1000; dias++) {
			teste += diario.getTaxaRendimento() * teste;
			dias += 1;
		}
		System.out.println(teste);
	}

}
