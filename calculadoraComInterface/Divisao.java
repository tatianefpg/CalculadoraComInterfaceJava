package calculadoraComInterface;

public class Divisao implements OperacaoMatematica {

	@Override
	public Double operacaoMatematica(Double numero1, Double numero2) {

		return numero1 / numero2;
	}
}