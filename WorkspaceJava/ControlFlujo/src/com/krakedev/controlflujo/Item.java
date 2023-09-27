package com.krakedev.controlflujo;

public class Item {
	public String nombre;
	public int productoActuales;
	public int productosDevueltos;
	public int productosVendidos;
	
	public void imprimir() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Productos Actuales: "+productoActuales);
		System.out.println("Productos Devueltos: "+productosDevueltos);
		System.out.println("Productos Vendidos: "+productosVendidos);
		System.out.println("-------");
	}
	public void vender(int productosVendido) {
		this.productoActuales=productoActuales-productosVendido;
		this.productosVendidos=productosVendidos+productosVendido;
	}
	public void devolver(int productosVendido) {
		this.productoActuales=productoActuales+productosVendido;
		this.productosVendidos=productosVendidos-productosVendido;
		this.productosDevueltos=productosDevueltos+productosVendido;
	}
}
