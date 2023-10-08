package com.krakedev.evaluacion;

public class Telefono {
	private String numero;
	private String tipo;
	private String estado;

	public String getNumero() {
		return numero;
	}

	public String getTipo() {
		return tipo;
	}

	public String getEstado() {
		return estado;
	}

	public Telefono(String numero, String tipo) {
		this.numero = numero;
		this.tipo = tipo;
		if (numero != null && tipo != null) {
			if (tipo.equals("Movil") || tipo.equals("Convencional")) {
				if (numero.length() == 7) {
					this.estado = "C";
				} else if (numero.length() == 10) {
					this.estado = "C";
				} else {
					this.estado = "E";
				}
			} else {
				this.estado = "E";
			}
		} else {
			this.estado = "E";
		}
	}
}
