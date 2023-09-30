package com.cmc.directorio.entidades;

public class AdminTelefono {
	public void activarMensajeria(Telefono telefono) {
		if (telefono.getOperadora() == "movi") {
			telefono.setTieneWhatsapp(true);
		} else {
			telefono.setTieneWhatsapp(false);
		}
	}

	public int contarMovi(Telefono telefono1, Telefono telefono2, Telefono telefono3) {
		int contarM = 0;
		if (telefono1.getOperadora() == "movi") {
			contarM = contarM + 1;
		}
		if (telefono2.getOperadora() == "movi") {
			contarM = contarM + 1;
		}
		if (telefono3.getOperadora() == "movi") {
			contarM = contarM + 1;
		}
		return contarM;
	}

	public int contarClaro(Telefono telefono1, Telefono telefono2, Telefono telefono3, Telefono telefono4) {
		int contarC = 0;
		if (telefono1.getOperadora() == "claro") {
			contarC = contarC + 1;
		}
		if (telefono2.getOperadora() == "claro") {
			contarC = contarC + 1;
		}
		if (telefono3.getOperadora() == "claro") {
			contarC = contarC + 1;
		}
		if (telefono4.getOperadora() == "claro") {
			contarC = contarC + 1;
		}
		return contarC;
	}
}
