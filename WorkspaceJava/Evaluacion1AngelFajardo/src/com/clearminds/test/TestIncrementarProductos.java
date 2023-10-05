package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestIncrementarProductos {
	public static void main(String[] args) {
		MaquinaDulces maquina = new MaquinaDulces();
		maquina.configurarMaquina("A", "B", "C", "D");

		Producto producto1 = new Producto("KE34","Papitas",   0.85);
		maquina.cargarProducto(producto1, "B", 4);

		Producto producto2 = new Producto("BDCR","Gatorade",  2.54);
		maquina.cargarProducto(producto2, "D", 5);
		
		maquina.mostrarProductos();

		

		System.out.println("------------Luego de incrementar-------------");

		maquina.incrementarProductos("KE34", 6);
		
		maquina.mostrarProductos();

	}
}
