package com.krakedev.test;

import com.krakedev.Auto;

public class TestAuto {

	public static void main(String[] args) {
		Auto  auto1 = new Auto ();
		Auto  auto2 = new Auto ();
		Auto  auto3 = new Auto ("Mazda",1998,43567.76);
		
		System.out.println("marca: "+auto3.getMarca());
		System.out.println("anio: "+auto3.getAnio());
		System.out.println("precio: "+auto3.getPrecio());
		
		System.out.println("______________");
		
		auto1.setMarca("Chevrolet");
		auto1.setAnio(1995);
		auto1.setPrecio(30000.99);
		
		auto2.setMarca("Hyundai");
		auto2.setAnio(2022);
		auto2.setPrecio(25000.75);
		
		System.out.println("marca: "+auto1.getMarca());
		System.out.println("anio: "+auto1.getAnio());
		System.out.println("precio: "+auto1.getPrecio());
		
		System.out.println("______________");
		
		System.out.println("marca: "+auto2.getMarca());
		System.out.println("anio: "+auto2.getAnio());
		System.out.println("precio: "+auto2.getPrecio());
	}

}
