package com.krakedev.evaluacion.test;

import com.krakedev.evaluacion.entidades.Informacion;
import com.krakedev.evaluacion.servicios.ServiciosCategorias;

public class TestActualizarCategoria {

	public static void main(String[] args) {
		Informacion p = new Informacion ("C003","BARRAS");
		try {
			ServiciosCategorias.actualizarCategoria(p);
		} catch (Exception e) {
			System.out.println("error en el sistema: "+e.getMessage());
		}
	}
}
