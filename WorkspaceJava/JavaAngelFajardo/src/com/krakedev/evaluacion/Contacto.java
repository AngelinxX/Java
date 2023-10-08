package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos;

	public Contacto(String cedula, String nombre, String apellido, Direccion direccion) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefonos = new ArrayList<Telefono>();
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public void imprimir() {
		System.out.println("Informacion del contacto:");
		System.out.println("Cedula: " + getCedula());
		System.out.println("Cedula: " + getNombre());
		System.out.println("Cedula: " + getApellido());
		System.out.println("Direccion: ");
		System.out.println(" Calle Principal: " + getDireccion().getCallePrincipal());
		System.out.println(" Calle Secundaria: " + getDireccion().getCalleSecundaria());
	}

	// public void imprimir() {
	// System.out.println("Direccion: " + getDireccion().getCallePrincipal() +
	// "Calle Secundaria: "
	// + getDireccion().getCalleSecundaria());
	// }

	public void imprimir1() {
		System.out.println("No tiene asociada una direccion");
	}

	public void agregarTelefono(Telefono telefono) {
		telefonos.add(telefono);
	}

	public void mostrarTelefonos() {
		System.out.println("Telefonos con estado 'C':");
		for (int i = 0; i < telefonos.size(); i++) {
			if (telefonos.get(i).getEstado().equals("C")) {
				System.out.println("Numero: " + telefonos.get(i).getNumero() + ", Tipo: " + telefonos.get(i).getTipo());
			}
		}
	}

	public ArrayList<Telefono> recuperarIncorrectos() {
		ArrayList<Telefono> incorrectos = new ArrayList<Telefono>();
		Telefono elementoIncorrecto = null;
		for (int i = 0; i < telefonos.size(); i++) {
			elementoIncorrecto = telefonos.get(i);
			if (elementoIncorrecto.getEstado().equals("E")) {
				incorrectos.add(elementoIncorrecto);
			}
		}
		return incorrectos;
	}

}
