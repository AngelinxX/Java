package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		int mContar = 0;
		Telefono telf1=new Telefono("movi", "098234234", 20);
		Telefono telf2=new Telefono("claro", "097841243", 23);
		Telefono telf3=new Telefono("claro", "094654561", 26);
		AdminTelefono at = new AdminTelefono();
		mContar = at.contarMovi(telf1, telf2, telf3);
		System.out.println("Numeros Movi: "+mContar);
	}

}
