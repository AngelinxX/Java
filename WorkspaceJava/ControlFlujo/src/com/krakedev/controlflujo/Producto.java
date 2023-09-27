package com.krakedev.controlflujo;

public class Producto {
	public String nombre;
	public double precio;
	
	public Producto(String nombre, double precio) {
		this.nombre=nombre;
		this.precio=precio;
	}
	public void setPrecio(double precio) {
		if (precio>0) {
			this.precio=precio*1;
		}else {
			this.precio=precio*-1;
		}
	}
	public void calcularPrecioPromo(double descuento) {
		this.precio=precio-(precio*descuento);
	}
}
