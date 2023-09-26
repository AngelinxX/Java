package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto  productoA = new Producto ();
		Producto  productoB = new Producto ();
		Producto  productoC = new Producto ();
		Producto  productoD = new Producto ("Curitas","Tratamiento heridas",0.24,35);
		
		productoA.setNombre("Parasetamol");
		productoA.setDescripcion("Medicamento para dolor");
		productoA.setPrecio(12.24);
		productoA.setStockActual(15);
		
		productoB.setNombre("Gasas");
		productoB.setDescripcion("Para cubrir heridas");
		productoB.setPrecio(23.76);
		productoB.setStockActual(8);
		
		productoC.setNombre("Alcohol");
		productoC.setDescripcion("Desinfectar heridas");
		productoC.setPrecio(0.44);
		productoC.setStockActual(30);
		
		System.out.println("nombre: "+productoA.getNombre());
		System.out.println("descripcion: "+productoA.getDescripcion());
		System.out.println("precio: "+productoA.getPrecio());
		System.out.println("stockActual: "+productoA.getStockActual());
		
		System.out.println("______________");
		
		System.out.println("nombre: "+productoB.getNombre());
		System.out.println("descripcion: "+productoB.getDescripcion());
		System.out.println("precio: "+productoB.getPrecio());
		System.out.println("stockActual: "+productoB.getStockActual());
		
		System.out.println("______________");
		
		System.out.println("nombre: "+productoC.getNombre());
		System.out.println("descripcion: "+productoC.getDescripcion());
		System.out.println("precio: "+productoC.getPrecio());
		System.out.println("stockActual: "+productoC.getStockActual());
		
		System.out.println("______________");
		
		System.out.println("nombre: "+productoD.getNombre());
		System.out.println("descripcion: "+productoD.getDescripcion());
		System.out.println("precio: "+productoD.getPrecio());
		System.out.println("stockActual: "+productoD.getStockActual());
	}

}
