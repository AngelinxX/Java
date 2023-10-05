package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestVender {

	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.configurarMaquina("A", "B", "C", "D");
		
		Producto producto=new Producto("KE34","Jugo",0.85);
		maquina.cargarProducto(producto, "C", 4);
		
		Producto producto2=new Producto("D456","Nachos",0.70);
		maquina.cargarProducto(producto2, "A", 6);

		maquina.vender("A");
		maquina.vender("B");
		
		maquina.mostrarProductos();

	}

}
