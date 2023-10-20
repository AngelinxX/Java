package com.krakedev.estaticos;

public class Calculos {
	private final double IVA = 12;
	// el modificador final hace que el valor  no se puede cambiar, es decir convierte la variable en constante
	public double calcularIva (double monto) {
		return monto*IVA/100;
	}
}
