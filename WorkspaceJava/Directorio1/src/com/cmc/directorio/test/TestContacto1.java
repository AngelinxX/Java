package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContacto;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Contacto infopeso;
		boolean comparacion;
		Telefono telef1=new Telefono("movi", "09327834724", 5);
		Contacto c1 = new Contacto("Basantes", telef1, 456.23);
		Telefono telef2=new Telefono("claro", "09904783484", 6);
		Contacto c2 = new Contacto("Tituana", telef2, 325.13);
		AdminContacto adm=new AdminContacto();
		infopeso=adm.buscarMasPesado(c1, c2);
		
		
		
		System.out.println("Apellido: "+infopeso.getApellido());
		System.out.println("Operadora: "+infopeso.getTelefono().getOperadora());
		System.out.println("Numero: "+infopeso.getTelefono().getNumero());
		System.out.println("Codigo: "+infopeso.getTelefono().getCodigo());
		System.out.println("Tiene Whastapp: "+infopeso.getTelefono().isTieneWhatsapp());
		System.out.println("Peso: "+infopeso.getPeso());
		
		System.out.println("--------------");
		
		comparacion=adm.compararOperadoras(c1, c2);
		System.out.println("Comparar operadora: "+comparacion);
	}

}
