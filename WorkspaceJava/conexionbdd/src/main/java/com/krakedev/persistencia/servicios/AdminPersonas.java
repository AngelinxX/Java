package com.krakedev.persistencia.servicios;

import java.sql.Connection;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersonas {
	public void insertar (Persona persona) {
		Connection con = ConexionBDD.conectar();
	}
}
