package calculadoraComInterface;

public class Subtracao implements OperacaoMatematica {

	@Override
	public Double operacaoMatematica(Double numero1, Double numero2) {
		double subtracao = numero1 - numero2;

		return subtracao;
	}

}
