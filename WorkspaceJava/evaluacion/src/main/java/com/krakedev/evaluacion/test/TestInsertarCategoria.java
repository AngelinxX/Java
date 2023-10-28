package com.krakedev.evaluacion.test;

import com.krakedev.evaluacion.entidades.Informacion;
import com.krakedev.evaluacion.servicios.ServiciosCategorias;

public class TestInsertarCategoria {

	public static void main(String[] args) {
		Informacion p = new Informacion ();
		try {
			p.setId_categoria("C004");
			p.setNombre("GALLETAS");
			ServiciosCategorias.insertar(p);
		} catch (Exception e) {
			System.out.println("error en el sistema: "+e.getMessage());
		}
	}

}
