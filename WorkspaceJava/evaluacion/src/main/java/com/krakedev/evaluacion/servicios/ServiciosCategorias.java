package com.krakedev.evaluacion.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.evaluacion.entidades.Informacion;
import com.krakedev.evaluacion.excepciones.KrakeException;
import com.krakedev.evaluacion.utils.ConexionBDD;

public class ServiciosCategorias {
	private static final Logger LOGGER = LogManager.getLogger(ServiciosCategorias.class);
	
	public static void insertar(Informacion informacion) throws KrakeException {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Categoria a insertar>>> " + informacion);
		try {
			// abrir la conexion
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"INSERT INTO categorias("
					+ "	id_categoria, nombre)"
					+ "	VALUES (?, ?);");
			ps.setString(1, informacion.getId_categoria());
			ps.setString(2, informacion.getNombre());
			
			
			
			ps.executeUpdate();

		} catch (Exception e) {
			// logger el error
			LOGGER.error("Error al insertar", e);
			throw new KrakeException("Error al insertar");
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new KrakeException("Error con la base de datos");
			}
		}
	}
	
	public static void actualizarCategoria(Informacion informacion) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Persona a actualizar>>> " + informacion);
		try {
			// abrir la conexion
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"UPDATE categorias"
					+ "	SET  nombre=?"
					+ "	WHERE id_categoria=?");
			
			
			ps.setString(1, informacion.getNombre());
			ps.setString(2, informacion.getId_categoria());

			ps.executeUpdate();

		} catch (Exception e) {
			// logger el error
			LOGGER.error("Error al insertar", e);
			throw new Exception("Error al insertar");
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}

}
