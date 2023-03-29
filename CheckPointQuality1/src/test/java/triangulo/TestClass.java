package triangulo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestClass {
	definirTipo DF = new definirTipo();

	@Test
	public void testValorErrado1() {
		int valor1 = 0;
		int valor2 = 10;
		int valor3 = 10;
		String resultado = DF.Tipo(valor1, valor2, valor3);
		assertEquals("Valor incorreto inserido", resultado);
	}

	@Test
	public void testValorErrado2() {
		int valor1 = 10;
		int valor2 = 0;
		int valor3 = 9;
		String resultado = DF.Tipo(valor1, valor2, valor3);
		assertEquals("Valor incorreto inserido", resultado);
	}

	@Test
	public void testValorErrado3() {
		int valor1 = 10;
		int valor2 = 9;
		int valor3 = -9;
		String resultado = DF.Tipo(valor1, valor2, valor3);
		assertEquals("Valor incorreto inserido", resultado);
	}

	@Test
	public void testValorErradoTodos() {
		int valor1 = -10;
		int valor2 = -10;
		int valor3 = 0;
		String resultado = DF.Tipo(valor1, valor2, valor3);
		assertEquals("Valor incorreto inserido", resultado);
	}

	@Test
	public void testEquilatero() {
		int valor1 = 10;
		int valor2 = 10;
		int valor3 = 10;
		String resultado = DF.Tipo(valor1, valor2, valor3);
		assertEquals("Equilatero", resultado);
	}

	@Test
	public void testEscaleno() {
		int valor1 = 10;
		int valor2 = 9;
		int valor3 = 8;
		String resultado = DF.Tipo(valor1, valor2, valor3);
		assertEquals("Escaleno", resultado);
	}

	@Test
	public void testIsoscelesCase1() {
		int valor1 = 10;
		int valor2 = 10;
		int valor3 = 9;
		String resultado = DF.Tipo(valor1, valor2, valor3);
		assertEquals("Isósceles", resultado);
	}

	@Test
	public void testIsoscelesCase2() {
		int valor1 = 10;
		int valor2 = 9;
		int valor3 = 10;
		String resultado = DF.Tipo(valor1, valor2, valor3);
		assertEquals("Isósceles", resultado);
	}

	@Test
	public void testIsoscelesCase3() {
		int valor1 = 9;
		int valor2 = 10;
		int valor3 = 10;
		String resultado = DF.Tipo(valor1, valor2, valor3);
		assertEquals("Isósceles", resultado);
	}
}
