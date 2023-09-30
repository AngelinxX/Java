package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		int cContar = 0;
		Telefono telf1=new Telefono("movi", "098234234", 20);
		Telefono telf2=new Telefono("claro", "097841243", 23);
		Telefono telf3=new Telefono("claro", "094654561", 26);
		Telefono telf4=new Telefono("claro", "094235345", 26);
		AdminTelefono at = new AdminTelefono();
		cContar = at.contarClaro(telf1, telf2, telf3, telf4);
		System.out.println("Numeros Claro: "+cContar);
	}

}
