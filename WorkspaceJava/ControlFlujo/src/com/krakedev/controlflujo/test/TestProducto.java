package com.krakedev.controlflujo.test;

import com.krakedev.controlflujo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto produ1=new Producto ("Impresora",0);
		Producto produ2=new Producto ("Impresora",0);
		produ1.setPrecio(-57.35);
		produ2.setPrecio(25.78);
		System.out.println(produ1.precio);
		produ1.calcularPrecioPromo(0.25);
		System.out.println(produ1.precio);
		System.out.println("-----");
		System.out.println(produ2.precio);
		produ2.calcularPrecioPromo(0.10);
		System.out.println(produ2.precio);
	}

}
