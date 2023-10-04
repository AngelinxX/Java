package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestPersonas {

	public static void main(String[] args) {
		AdminPersonas admin = new AdminPersonas();
		admin.agregar(new Persona("Mario", "Benedetti", 50));
		admin.agregar(new Persona("Clark", "Kent", 30));
		admin.agregar(new Persona("Bruno", "Dias", 25));
		admin.imprimir();
		
		Persona p1=admin.buscarPorNombre("Jose");
		if(p1!=null) {
			System.out.println("Encontrado:"+p1.getApellido()+" "+p1.getEdad());	
		}else {
			System.out.println("No existe el nombre Jose");
		}
		ArrayList<Persona> personaMayores=admin.buscarMayores(40);
		System.out.println("Mayores: "+personaMayores.size());
	}
}
