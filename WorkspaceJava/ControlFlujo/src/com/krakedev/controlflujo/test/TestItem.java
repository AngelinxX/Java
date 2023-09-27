package com.krakedev.controlflujo.test;

import com.krakedev.controlflujo.Item;

public class TestItem {

	public static void main(String[] args) {
		Item item1= new Item ();
		item1.nombre="Cuaderno";
		item1.productoActuales=20;
		item1.vender(8);
		item1.devolver(3);
		item1.vender(3);
		item1.devolver(1);
		item1.imprimir();
		
		Item item2= new Item ();
		item2.nombre="Esferos";
		item2.productoActuales=40;
		item2.vender(25);
		item2.devolver(10);
		item2.vender(14);
		item2.devolver(6);
		item2.imprimir();
	}

}
