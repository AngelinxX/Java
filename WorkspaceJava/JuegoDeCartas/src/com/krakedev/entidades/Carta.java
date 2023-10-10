package com.krakedev.entidades;

public class Carta {
	private Numero numero;
	private String palo;
	private String estado;

	public Carta(Numero elementoNumero, String palo) {
		this.numero = elementoNumero;
		this.palo = palo;
		this.estado = "N";
	}

	public Numero getNumero() {
		return numero;
	}

	public void setNumero(Numero numero) {
		this.numero = numero;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return numero + " <-> " + palo;
	}

}
