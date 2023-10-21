package com.krakedev.estaticos.ejercicio.logica;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;

public class AdminAlarmas {
	public ArrayList<Alarma> alarmas = new ArrayList<Alarma>() ;
		
	public ArrayList<Alarma> getAlarmas() {
		return alarmas;
	}

	public void agregarAlarma(Alarma alarma) {
		alarmas.add(alarma);
	}
}
