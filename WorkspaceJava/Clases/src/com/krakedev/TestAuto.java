package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto  auto1 = new Auto ();
		Auto  auto2 = new Auto ();
		
		auto1.marca = "Chevrolet";
		auto1.anio = 1995;
		auto1.precio = 30000.99;
		
		auto2.marca = "Hyundai";
		auto2.anio = 2022;
		auto2.precio = 25000.75;
		
		System.out.println("marca: "+auto1.marca);
		System.out.println("anio: "+auto1.anio);
		System.out.println("precio: "+auto1.precio);
		
		System.out.println("______________");
		
		System.out.println("marca: "+auto2.marca);
		System.out.println("anio: "+auto2.anio);
		System.out.println("precio: "+auto2.precio);
	}

}
