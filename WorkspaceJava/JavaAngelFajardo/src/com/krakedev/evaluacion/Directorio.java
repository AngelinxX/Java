package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;
	private ArrayList<Contacto> correctos;
	private ArrayList<Contacto> incorrectos;

	
	
	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}

	public Directorio() {
		contactos = new ArrayList<Contacto>();
		correctos = new ArrayList<Contacto>();
		incorrectos = new ArrayList<Contacto>();
	}

	public boolean agregarContacto(Contacto contacto) {
		boolean ingresar = true;
		for (int i = 0; i < contactos.size(); i++) {
			if (contactos.get(i).getCedula() == contacto.getCedula()) {
				ingresar = false;
			}
		}
		if (ingresar == true) {
			contactos.add(contacto);
			this.fechaModificacion = new Date();
		}
		return ingresar;
	}

	public String consultarUltimaModificacion() {
		SimpleDateFormat DateFor = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
		String stringDate = DateFor.format(fechaModificacion);
		return stringDate;

	}

	public int contarPerdidos() {
		int total = 0;
		Contacto convencionalC;
		for (int i = 0; i < contactos.size(); i++) {
			convencionalC = contactos.get(i);
			if (convencionalC.getDireccion() == null) {
				total = total + 1;
			}
		}
		return total;
	}

	public int contarFijos() {
		int total = 0;
		for (int i = 0; i < contactos.size(); i++) {
			if (contactos.get(i).getTelefonos()!= null) {
				for (int j=0; j<contactos.get(i).getTelefonos().size();j++) {
					if(contactos.get(i).getTelefonos().get(j).getTipo().equals("Convencional")&&contactos.get(i).getTelefonos().get(j).getEstado().equals("C")) {
						total = total + 1;
					}
				}
			}
		}
		return total;
	}

	public Contacto buscarPorCedula(String cedula) {
		Contacto cedulaEncontrada = null;
		Contacto elementoCedula = null;
		for (int i = 0; i < contactos.size(); i++) {
			elementoCedula = contactos.get(i);
			if (cedula.equals(elementoCedula.getCedula())) {
				cedulaEncontrada = elementoCedula;
			}
		}
		return cedulaEncontrada;
	}

	public void depurar() {
		Contacto elementos = null;
		for (int i = 0; i < contactos.size(); i++) {
			elementos = contactos.get(i);
			if (elementos.getDireccion() == null) {
				incorrectos.add(elementos);
			} 
			if (elementos.getDireccion() != null) {
				correctos.add(elementos);
			}
		}
		contactos.clear();
	}

}
