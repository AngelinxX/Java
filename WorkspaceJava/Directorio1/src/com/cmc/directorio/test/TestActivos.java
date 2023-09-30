package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContacto;
import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		Telefono telef1=new Telefono("claro", "09327834724", 5);
		Contacto c1 = new Contacto("Basantes", telef1, 456.23);
		AdminContacto usuario1=new AdminContacto();
		System.out.println("Tiene Whastapp: "+c1.getTelefono().isTieneWhatsapp());
		
		AdminTelefono at = new AdminTelefono();
		at.activarMensajeria(telef1);
		usuario1.activarUsuario(c1);
		System.out.println("Status usuario : "+c1.isActivo());
	}

}
