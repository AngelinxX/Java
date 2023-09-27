package com.krakedev.controlflujo.test;

import com.krakedev.controlflujo.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante est1 = new Estudiante ("Jose");
		Estudiante est2 = new Estudiante ("Alberto");
		Estudiante est3 = new Estudiante ("Maria");
		
		est1.calificar(9);
		est2.calificar(5);
		est3.calificar(8);
		
		System.out.println(est1.nombre);
		System.out.println(est1.nota);
		System.out.println(est1.tipo);
		System.out.println("------");
		System.out.println(est2.nombre);
		System.out.println(est2.nota);
		System.out.println(est2.tipo);
		System.out.println("------");
		System.out.println(est3.nombre);
		System.out.println(est3.nota);
		System.out.println(est3.tipo);
	}

}
