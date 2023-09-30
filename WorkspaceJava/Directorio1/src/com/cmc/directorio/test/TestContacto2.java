package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContacto;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto2 {

	public static void main(String[] args) {
		Contacto infopeso;
		boolean comparacion;
		Telefono telef1=new Telefono("claro", "09312834785", 7);
		Contacto c1 = new Contacto("Hernandez", telef1, 167.32);
		Telefono telef2=new Telefono("claro", "09478231245", 8);
		Contacto c2 = new Contacto("Chavez", telef2, 189.65);
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
