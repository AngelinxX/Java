package com.krakedev.evaluacion.test;

import java.sql.Connection;

import com.krakedev.evaluacion.excepciones.KrakeException;
import com.krakedev.evaluacion.utils.ConexionBDD;

public class TestConexionBDD {

	public static void main(String[] args) {
		Connection con = null;
		try {
			con = ConexionBDD.conectar();
			System.out.println("Conexion obtenida");
		} catch (KrakeException e) {
			System.out.println("Conexion fallida");
		}
	}
}
