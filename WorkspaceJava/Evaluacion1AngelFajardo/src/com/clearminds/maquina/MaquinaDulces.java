package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo;

	public MaquinaDulces() {
		celdas = new ArrayList<Celda>();
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void agregarCelda(Celda celda) {
		celdas.add(celda);
	}

	public void configurarMaquina(String ce1, String ce2, String ce3, String ce4) {
		celdas.add(new Celda(ce1));
		celdas.add(new Celda(ce2));
		celdas.add(new Celda(ce3));
		celdas.add(new Celda(ce4));
	}

	public void mostrarConfiguracion() {
		Celda elementosCelda;
		for (int i = 0; i < celdas.size(); i++) {
			elementosCelda = celdas.get(i);
			System.out.println("Celda: " + elementosCelda.getCodigo());
		}
	}

	public Celda buscarCelda(String cod) {
		Celda celdaEncontrada = null;
		Celda elementoCelda = null;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (cod.equals(elementoCelda.getCodigo())) {
				celdaEncontrada = elementoCelda;
			}
		}
		return celdaEncontrada;
	}

	public void cargarProducto(Producto productoX, String codx, int stockX) {
		Celda celdaRecuperada;
		celdaRecuperada = buscarCelda(codx);
		celdaRecuperada.ingresarProducto(productoX, stockX);
	}

	public void mostrarProductos() {
		Celda elementoCelda;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (elementoCelda.getStock() == 0) {
				System.out.println("Celda:" + elementoCelda.getCodigo() + " Stock:" + elementoCelda.getStock()
						+ " Sin Producto asignado");
			} else {
				System.out.println("Celda:" + elementoCelda.getCodigo() + " Stock:" + elementoCelda.getStock()
						+ " Producto:" + elementoCelda.getProducto().getNombre() + " Precio:"
						+ elementoCelda.getProducto().getPrecio());
			}
		}
		if (this.saldo != 0) {
			System.out.println("Saldo:" + this.saldo);
		}
	}

	public Celda mostrarProductoCelda(String cod) {
		Celda elementoCelda = null;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (cod.equals(elementoCelda.getCodigo())) {
				System.out.println("Celda:" + elementoCelda.getCodigo() + " Stock:" + elementoCelda.getStock());
			}
		}
		return elementoCelda;
	}

	public Producto buscarProductoEnCelda(String cod) {
		Celda elementoCelda;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (cod.equals(elementoCelda.getCodigo())) {
				return elementoCelda.getProducto();
			}
		}
		return null;
	}

	public double consultarPrecio(String cod) {
		Celda elementoCelda;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (cod.equals(elementoCelda.getCodigo())) {
				return elementoCelda.getProducto().getPrecio();
			}
		}
		return 0;
	}

	public Celda buscarCeldaProducto(String cod) {
		Celda elementoCelda;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (elementoCelda.getProducto() != null && cod.equals(elementoCelda.getProducto().getCodigo())) {
				return elementoCelda;
			}
		}
		return null;
	}

	public void incrementarProductos(String codigo, int stock) {
		Celda celdaEncontrada;
		celdaEncontrada = buscarCeldaProducto(codigo);
		celdaEncontrada.setStock(celdaEncontrada.getStock() + stock);
	}

	public void vender(String codigo) {
		Celda elementoEncontrado;
		for (int i = 0; i < celdas.size(); i++) {
			elementoEncontrado = celdas.get(i);
			if (elementoEncontrado.getProducto() != null && codigo.equals(elementoEncontrado.getCodigo())) {
				elementoEncontrado.setStock(elementoEncontrado.getStock() - 1);
				this.saldo = this.saldo + elementoEncontrado.getProducto().getPrecio();
			}
		}
	}

	public double venderConCambio(String codigo, double valorIngresado) {
		Celda elementoEncontrado;
		for (int i = 0; i < celdas.size(); i++) {
			elementoEncontrado = celdas.get(i);
			if (elementoEncontrado.getProducto() != null && codigo.equals(elementoEncontrado.getCodigo())) {
				elementoEncontrado.setStock(elementoEncontrado.getStock() - 1);
				this.saldo = this.saldo + elementoEncontrado.getProducto().getPrecio();
			}
		}
		return valorIngresado - this.saldo;
	}
	
	public void configurarMaquinaM(String ce1, String ce2, String ce3, String ce4,String ce5, String ce6) {
		celdas.add(new Celda(ce1));
		celdas.add(new Celda(ce2));
		celdas.add(new Celda(ce3));
		celdas.add(new Celda(ce4));
		celdas.add(new Celda(ce5));
		celdas.add(new Celda(ce6));
	}
	public ArrayList<Producto> buscarMenores(double limite) {
		ArrayList<Producto> menores = new ArrayList<Producto>();
		Celda elementoEncontrado= null;
		for (int i = 0; i < celdas.size(); i++) {
			elementoEncontrado = celdas.get(i);
			if (elementoEncontrado.getProducto().getPrecio()<= limite) {
				menores.add(elementoEncontrado.getProducto());
			}
		}
		return menores;
	}
}
