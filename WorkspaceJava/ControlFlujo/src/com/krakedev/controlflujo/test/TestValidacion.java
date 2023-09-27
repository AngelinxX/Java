package com.krakedev.controlflujo.test;

import com.krakedev.controlflujo.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		Validacion valor1=new Validacion();
		valor1.validarMonto(123);
		valor1.validarMonto(265);
		valor1.validarMonto(-213);
	}

}
