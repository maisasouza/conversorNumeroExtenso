package br.mg.puc.devops.conversorNumeroExtenso;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class conversorNumeroExtensoTest {

	@Test
	public void primeiroTeste() {
		ConversorExtenso conversor = new ConversorExtenso();
		String retorno = conversor.converter(1.00);
		
		Assert.assertEquals("um", retorno);
	}
	
	@Test
	public void testeNumeroFracionado() {
		ConversorExtenso conversor = new ConversorExtenso();
		String retorno = conversor.converter(1.13);
		
		Assert.assertEquals("inválido", retorno);
	}
	
	@Test
	public void testeLimiteMaiorNumero() {
		ConversorExtenso conversor = new ConversorExtenso();
		String retorno = conversor.converter(1000.00);
		
		Assert.assertEquals("inválido", retorno);
	}
	
	@Test
	public void testeLimiteNegativo() {
		ConversorExtenso conversor = new ConversorExtenso();
		String retorno = conversor.converter(-1.00);
		
		Assert.assertEquals("inválido", retorno);
	}
	
	@Test
	public void testeFracaoComZero() {
		ConversorExtenso conversor = new ConversorExtenso();
		String retorno = conversor.converter(0.30);
		
		Assert.assertEquals("inválido", retorno);
	}
	
	@Test
	public void testeNove() {
		ConversorExtenso conversor = new ConversorExtenso();
		String retorno = conversor.converter(9.00);
		
		Assert.assertEquals("nove", retorno);
	}
	
	@Test
	public void testeZero() {
		ConversorExtenso conversor = new ConversorExtenso();
		String retorno = conversor.converter(0.00);
		
		Assert.assertEquals("zero", retorno);
	}
	
	@Test
	public void testeOnze() {
		ConversorExtenso conversor = new ConversorExtenso();
		String retorno = conversor.converter(11.00);
		
		Assert.assertEquals("onze", retorno);
	}
	
	@Test
	public void testeDesenove() {
		ConversorExtenso conversor = new ConversorExtenso();
		String retorno = conversor.converter(19.00);
		
		Assert.assertEquals("desenove", retorno);
	}
	
	@Test
	public void testeVinte() {
		ConversorExtenso conversor = new ConversorExtenso();
		String retorno = conversor.converter(20.00);
		
		Assert.assertEquals("vinte", retorno);
	}
	
	@Test
	public void testetrintaEUm() {
		ConversorExtenso conversor = new ConversorExtenso();
		String retorno = conversor.converter(31.00);
		
		Assert.assertEquals("trinta e um", retorno);
	}
	
	@Test
	public void testeQuarenta() {
		ConversorExtenso conversor = new ConversorExtenso();
		String retorno = conversor.converter(40.00);
		
		Assert.assertEquals("quarenta", retorno);
	}
	
	@Test
	public void testeQuarentaENove() {
		ConversorExtenso conversor = new ConversorExtenso();
		String retorno = conversor.converter(49.00);
		
		Assert.assertEquals("quarenta e nove", retorno);
	}
	
	@Test
	public void testeCem() {
		ConversorExtenso conversor = new ConversorExtenso();
		String retorno = conversor.converter(100.00);
		
		Assert.assertEquals("cem", retorno);
	}
	
	@Test
	public void testeCentoEUm() {
		ConversorExtenso conversor = new ConversorExtenso();
		String retorno = conversor.converter(101.00);
		
		Assert.assertEquals("cento e um", retorno);
	}
	
	@Test
	public void testeCentoEVinteETres() {
		ConversorExtenso conversor = new ConversorExtenso();
		String retorno = conversor.converter(123.00);
		
		Assert.assertEquals("cento e vinte e três", retorno);
	}
	
	@Test
	public void testeCentoEDesenove() {
		ConversorExtenso conversor = new ConversorExtenso();
		String retorno = conversor.converter(119.00);
		
		Assert.assertEquals("cento e desenove", retorno);
	}
	
	@Test
	public void testeCentoESetenta() {
		ConversorExtenso conversor = new ConversorExtenso();
		String retorno = conversor.converter(170.00);
		
		Assert.assertEquals("cento e setenta", retorno);
	}
	
	@Test
	public void testeDuzentos() {
		ConversorExtenso conversor = new ConversorExtenso();
		String retorno = conversor.converter(200.00);
		
		Assert.assertEquals("duzentos", retorno);
	}
	
	@Test
	public void testeDuzentosEUm() {
		ConversorExtenso conversor = new ConversorExtenso();
		String retorno = conversor.converter(201.00);
		
		Assert.assertEquals("duzentos e um", retorno);
	}
	
	@Test
	public void testeNovecentosENoventa() {
		ConversorExtenso conversor = new ConversorExtenso();
		String retorno = conversor.converter(990.00);
		
		Assert.assertEquals("novecentos e noventa", retorno);
	}
	
	@Test
	public void testeNovecentosENoventaENove() {
		ConversorExtenso conversor = new ConversorExtenso();
		String retorno = conversor.converter(999.00);
		
		Assert.assertEquals("novecentos e noventa e nove", retorno);
	}
	
	@Test
	public void testeCentoEDez() {
		ConversorExtenso conversor = new ConversorExtenso();
		String retorno = conversor.converter(110.00);
		
		Assert.assertEquals("cento e dez", retorno);
	}
	
	

}
