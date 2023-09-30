package com.krakedev.test;

import com.krakedev.composicion.AdminProducto;
import com.krakedev.composicion.Producto;

public class TestAdminProducto {

	public static void main(String[] args) {
		Producto mc;
		AdminProducto admin =new AdminProducto();
		Producto productoA =new Producto("Papas",0.35);
		Producto productoB =new Producto("Cereales",0.35);
		
		mc = admin.buscarMasCaro(productoA, productoB);
		//mc esta null
		
		if (mc==null) {
			System.out.println("Son iguales");
		}else {
		System.out.println("El mas caro es: "+mc.getNombre());
		}
	}

}
