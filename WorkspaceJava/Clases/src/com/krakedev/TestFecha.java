package com.krakedev;

public class TestFecha {

	public static void main(String[] args) {
		Fecha fecha1=new Fecha();
		Fecha fecha2=new Fecha(2022,8,27);
		
		fecha1.setAnio(2000);
		fecha1.setMes(12);
		fecha1.setDia(12);
		
		System.out.println(fecha1.getAnio());
		
		System.out.println("______________");
		
		System.out.println(fecha2.getAnio());
		System.out.println(fecha2.getMes());
		System.out.println(fecha2.getDia());
		
	}

}
