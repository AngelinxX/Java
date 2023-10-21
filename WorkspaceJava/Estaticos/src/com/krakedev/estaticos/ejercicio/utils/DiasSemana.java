package com.krakedev.estaticos.ejercicio.utils;

public class DiasSemana {

	public static String formatearHora(int numero) {
		String valor;
		if (numero >= 0 && numero < 10) {
			valor = "0" + numero;
			return valor;
		}else {
			valor = ""+numero;
			return valor;
		}
	}

	public static String formatearDia(int dia) {
		if (dia == LUNES) {
			return "Lunes";
		} else if (dia == MARTES) {
			return "Martes";
		} else if (dia == MIERCOLES) {
			return "Miércoles";
		} else if (dia == JUEVES) {
			return "Jueves";
		} else if (dia == VIERNES) {
			return "Viernes";
		} else if (dia == SABADO) {
			return "Sábado";
		} else if (dia == DOMINGO) {
			return "Domingo";
		} else {
			return "Desconocido";
		}
	}

	public static final int LUNES = 0;
	public static final int MARTES = 1;
	public static final int MIERCOLES = 2;
	public static final int JUEVES = 3;
	public static final int VIERNES = 4;
	public static final int SABADO = 5;
	public static final int DOMINGO = 6;
}
