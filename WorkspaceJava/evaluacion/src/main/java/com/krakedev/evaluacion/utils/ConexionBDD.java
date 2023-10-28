package com.krakedev.evaluacion.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.evaluacion.excepciones.KrakeException;

public class ConexionBDD {
	private final static String DRIVER="org.postgresql.Driver";
	private final static String URL="jdbc:postgresql://localhost:5432/postgres";
	private final static String USUARIO="postgres";
	private final static String CLAVE="postgres";
	private static final  Logger LOGGER = LogManager.getLogger(ConexionBDD.class);
	public static Connection conectar() throws KrakeException{
		Connection connection = null;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USUARIO,CLAVE);
			LOGGER.debug("obteniendo conexion"); 
		} catch (ClassNotFoundException e) {
			LOGGER.error("Error infraestructura",e);
			throw new KrakeException("Error infraestructura");
		} catch (SQLException e) {
			LOGGER.error("Error al conectarse",e);
			throw new KrakeException("Error al conectarse");
		}
		return connection;
	}
}
