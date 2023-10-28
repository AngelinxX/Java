package com.krakedev.evaluacion.excepciones;

public class KrakeException extends Exception {
	
	public KrakeException(String mensaje) {
		super(mensaje);
	}

	public KrakeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KrakeException(String mensaje, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(mensaje, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public KrakeException(String mensaje, Throwable cause) {
		super(mensaje, cause);
		// TODO Auto-generated constructor stub
	}

	public KrakeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	
}
