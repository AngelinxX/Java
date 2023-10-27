package com.krakedev.persistencia.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Convertidor {
	private static final String FORMATO_FECHA = "yyyy/MM/dd";
	private static final String FORMATO_HORA = "hh:mm:ss";

	public static Date convertirFecha(String fechaStr) throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_FECHA);
		Date fechaDate = null;
		try {
			fechaDate = sdf.parse(fechaStr);
		} catch (ParseException e) {
			e.printStackTrace();
			throw new Exception("La fecha no tiene el formato correcto "+fechaStr);
		}
		return fechaDate;
	}

	public static Date convertirHora(String horaStr) throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat( FORMATO_HORA);
		Date horaDate = null;
		try {
			horaDate = sdf.parse(horaStr);
		} catch (ParseException e) {
			e.printStackTrace();
			throw new Exception("La fecha no tiene el formato correcto "+horaStr);
		}
		return horaDate;
	}
}