package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		int resultadoSuma;
		double resultadoResta;
		double resultadoMultiplicar;
		double resultadoDividir;
		double resultadoPromediar;
		calcu = new Calculadora();
		resultadoSuma=calcu.sumar(5, 3);
		resultadoResta=calcu.restar(10,3);
		resultadoMultiplicar=calcu.multiplicacion(10,5);
		resultadoDividir=calcu.dividir(10,2);
		resultadoPromediar=calcu.promediar(10,8,9);
		System.out.println("Resultado Suma: "+resultadoSuma);
		System.out.println("Resultado Resta: "+resultadoResta);
		System.out.println("Resultado Multiplicar: "+resultadoMultiplicar);
		System.out.println("Resultado Dividir: "+resultadoDividir);
		System.out.println("Resultado Promediar: "+resultadoPromediar);
		calcu.mostrarResultado();
	}

}
