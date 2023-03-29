package triangulo;

public class definirTipo {
	public String Tipo(int valor1, int valor2, int valor3) {
		String tipo = null;

		if (valor1 > 0 && valor2 > 0 && valor3 > 0) {
			if (valor1 == valor2 && valor2 == valor3) {
				tipo = "Equilatero";
			} else if ((valor1 == valor2 && valor2 != valor3) || (valor1 == valor3 && valor1 != valor2)|| (valor1 != valor3 && valor3 == valor2)) {
				tipo = "Isósceles";
			} else {
				tipo = "Escaleno";
			}
		} else {
			tipo = "Valor incorreto inserido";
		}
		return tipo;
		}
}
