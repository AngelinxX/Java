package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto  productoA = new Producto ();
		Producto  productoB = new Producto ();
		Producto  productoC = new Producto ();
		
		productoA.nombre = "Parasetamol";
		productoA.descripcion = "Medicamento para dolor";
		productoA.precio = 12.24;
		productoA.stockActual = 15;
		
		productoB.nombre = "Gasas";
		productoB.descripcion = "Para cubrir heridas";
		productoB.precio = 23.76;
		productoB.stockActual = 8;
		
		productoC.nombre = "Alcohol";
		productoC.descripcion = "Desinfectar heridas";
		productoC.precio = 0.44;
		productoC.stockActual = 30;
		
		System.out.println("nombre: "+productoA.nombre);
		System.out.println("descripcion: "+productoA.descripcion);
		System.out.println("precio: "+productoA.precio);
		System.out.println("stockActual: "+productoA.stockActual);
		
		System.out.println("______________");
		
		System.out.println("nombre: "+productoB.nombre);
		System.out.println("descripcion: "+productoB.descripcion);
		System.out.println("precio: "+productoB.precio);
		System.out.println("stockActual: "+productoB.stockActual);
		
		System.out.println("______________");
		
		System.out.println("nombre: "+productoC.nombre);
		System.out.println("descripcion: "+productoC.descripcion);
		System.out.println("precio: "+productoC.precio);
		System.out.println("stockActual: "+productoC.stockActual);
	}

}
