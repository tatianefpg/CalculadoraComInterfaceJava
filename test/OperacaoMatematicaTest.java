package test;

import org.junit.Assert;
import org.junit.Test;

import calculadoraComInterface.Divisao;
import calculadoraComInterface.Multiplicacao;
import calculadoraComInterface.OperacaoMatematica;
import calculadoraComInterface.Soma;
import calculadoraComInterface.Subtracao;

public class OperacaoMatematicaTest {

	@Test
	public void operacaoMatematicaTest() {
		OperacaoMatematica operacao = new Soma();
		Assert.assertTrue(32 == operacao.operacaoMatematica(30d, 2d));
		
		operacao = new Subtracao();
		Assert.assertTrue(28 == operacao.operacaoMatematica(30d, 2d));
		
		operacao = new Multiplicacao();
		Assert.assertTrue(60 == operacao.operacaoMatematica(30d, 2d));
		
		operacao = new Divisao();
		Assert.assertTrue(15 == operacao.operacaoMatematica(30d, 2d));
	}
}
