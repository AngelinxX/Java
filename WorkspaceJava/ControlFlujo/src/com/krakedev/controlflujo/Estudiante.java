package com.krakedev.controlflujo;

public class Estudiante {
	public String nombre;
	public double nota;
	public String tipo;
	
	public Estudiante(String nombre) {
		this.nombre=nombre;
	}
	
	public void calificar(double nota) {
		this.nota=nota;
		if(nota<8) {
			this.tipo="F";
		}else if (nota>=8) {
			this.tipo="A";
		}
	}
}
