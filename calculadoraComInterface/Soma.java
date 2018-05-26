package calculadoraComInterface;

public class Soma implements OperacaoMatematica {

	@Override
	public Double operacaoMatematica(Double numero1, Double numero2) {
		double soma = numero1 + numero2;

		return soma;
	}

}
