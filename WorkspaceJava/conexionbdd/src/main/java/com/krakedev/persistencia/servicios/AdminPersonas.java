package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersonas {
	public static void insertar (Persona persona) {
		Connection con = null;
		PreparedStatement ps;
		try {
			//abrir la conexion
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"insert into personas(cedula,nombre,apellido,estado_civil,estatura,cantidad_ahorrada,numero_hijos,fecha_nacimiento,hora_nacimiento)"
							+ "values (?,?,?,?,?,?,?,?,?)");
			ps.setString(1, persona.getCedula());
			ps.setString(2, persona.getNombre());
			ps.setString(3, persona.getApellido());
			ps.setString(4, persona.getEstadoCivil().getCodigo());
			ps.setDouble(5, persona.getEstatura());
			ps.setBigDecimal(6, persona.getCantidadAhorrada());
			ps.setInt(7, persona.getNumeroHijos());
			ps.setDate(8, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(9, new Time(persona.getHoraNacimiento().getTime()));
			
			ps.executeUpdate();


		} catch (Exception e) {
			// mostrar el error al usuario
			System.out.println(e.getMessage());
			// logger el error
			e.printStackTrace();
		}finally {
			//cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Error de infraestructura");
			}
		}
		
	}
}
