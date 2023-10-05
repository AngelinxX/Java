	package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		MaquinaDulces maquina = new MaquinaDulces();
        maquina.configurarMaquinaM("A", "B", "C", "D","E","F");
        Producto producto1 = new Producto("AFER", "Cordones", 0.35);
        maquina.cargarProducto(producto1, "A", 6);
        Producto producto2 = new Producto("LUJL", "Marcadores", 1.54);
        maquina.cargarProducto(producto2, "B", 5);
        Producto producto3 = new Producto("BASW", "Cartulina", 0.44);
        maquina.cargarProducto(producto3, "C", 8);
        Producto producto4 = new Producto("LAJE", "Sticker", 1.23);
        maquina.cargarProducto(producto4, "D", 6);
        Producto producto5 = new Producto("YTUS", "Llavero", 0.75);
        maquina.cargarProducto(producto5, "E", 5);
        Producto producto6 = new Producto("MIUJ", "Esfero", 0.25);
        maquina.cargarProducto(producto6, "F", 9);
        ArrayList<Producto> productosMenores=  maquina.buscarMenores(0.55);
		System.out.println("Menores al limite de productos: "+productosMenores.size());
		for (int i=0;i<productosMenores.size();i++) {
			System.out.println("Producto: "+productosMenores.get(i).getNombre()+" Precio: "+productosMenores.get(i).getPrecio());
		}
	}

}
