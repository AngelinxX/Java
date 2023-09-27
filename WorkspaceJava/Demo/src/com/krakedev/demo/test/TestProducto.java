package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto produc1=new Producto(13,"Parasetamol");
		produc1.setDescripcion("Para aliviar el dolor");
		produc1.setPeso(0.25);
		
		System.out.println("Codigo: "+produc1.getCodigo());
		System.out.println("Nombre: "+produc1.getNombre());
		System.out.println("Descripcion: "+produc1.getDescripcion());
		System.out.println("Peso: "+produc1.getPeso());
	}

}
