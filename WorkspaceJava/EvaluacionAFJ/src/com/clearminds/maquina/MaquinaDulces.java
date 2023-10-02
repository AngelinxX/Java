package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;
	
	public Celda getCelda1() {
		return celda1;
	}
	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}
	public Celda getCelda2() {
		return celda2;
	}
	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}
	public Celda getCelda3() {
		return celda3;
	}
	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}
	public Celda getCelda4() {
		return celda4;
	}
	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void configurarMaquina (String ce1,String ce2,String ce3,String ce4) {
		this.celda1=new Celda(ce1);
		this.celda2=new Celda(ce2);
		this.celda3=new Celda(ce3);
		this.celda4=new Celda(ce4);
	}
	public void mostrarConfiguracion() {
		System.out.println(celda1.getCodigo());
		System.out.println(celda2.getCodigo());
		System.out.println(celda3.getCodigo());
		System.out.println(celda4.getCodigo());
		System.out.println(saldo);
	}
	public Celda buscarCelda(String cod) {
		if (celda1.getCodigo() == cod) {
			return celda1;
		} else if (celda2.getCodigo() == cod) {
			return celda2;
		} else if (celda3.getCodigo() == cod) {
			return celda3;
		} else if (celda4.getCodigo() == cod) {
			return celda4;
		}else {
			return null;
		}
	}
	
	public void cargarProducto(Producto productoX, String codx,int stockX ) {
		Celda celdaRecuperada;
		celdaRecuperada=buscarCelda(codx);
		celdaRecuperada.ingresarProducto(productoX,stockX);
	}
	
	public void mostrarProductos() {
		System.out.println("***********CELDA "+celda1.getCodigo());
		if (celda1.getStock()==0) {
		System.out.println("Stock:"+celda1.getStock());
		System.out.println("La celda no tiene producto!!!");
		}else {
			System.out.println("Stock:"+celda1.getStock());
			System.out.println("Nombre Producto:"+celda1.getProducto().getNombre());
			System.out.println("Precio Producto:"+celda1.getProducto().getPrecio());
			System.out.println("Codigo Producto:"+celda1.getProducto().getCodigo());	
		}
		
		System.out.println("***********CELDA "+celda2.getCodigo());
		if (celda2.getStock()==0) {
			System.out.println("Stock:"+celda2.getStock());
			System.out.println("La celda no tiene producto!!!");
			}else {
				System.out.println("Stock:"+celda2.getStock());
				System.out.println("Nombre Producto:"+celda2.getProducto().getNombre());
				System.out.println("Precio Producto:"+celda2.getProducto().getPrecio());
				System.out.println("Codigo Producto:"+celda2.getProducto().getCodigo());	
			}
		System.out.println("***********CELDA "+celda3.getCodigo());
		if (celda3.getStock()==0) {
			System.out.println("Stock:"+celda3.getStock());
			System.out.println("La celda no tiene producto!!!");
			}else {
				System.out.println("Stock:"+celda3.getStock());
				System.out.println("Nombre Producto:"+celda3.getProducto().getNombre());
				System.out.println("Precio Producto:"+celda3.getProducto().getPrecio());
				System.out.println("Codigo Producto:"+celda3.getProducto().getCodigo());	
			}
		
		System.out.println("***********CELDA "+celda4.getCodigo());
		if (celda4.getStock()==0) {
			System.out.println("Stock:"+celda4.getStock());
			System.out.println("La celda no tiene producto!!!");
			}else {
				System.out.println("Stock:"+celda4.getStock());
				System.out.println("Nombre Producto:"+celda4.getProducto().getNombre());
				System.out.println("Precio Producto:"+celda4.getProducto().getPrecio());
				System.out.println("Codigo Producto:"+celda4.getProducto().getCodigo());	
			}
		if (this.saldo!=0) {
			System.out.println("Saldo:"+this.saldo);
		}
	}
	
	public Producto buscarProductoEnCelda(String cod) {
		if (celda1.getCodigo() == cod) {
			return celda1.getProducto();
		} else if (celda2.getCodigo() == cod) {
			return celda2.getProducto();
		} else if (celda3.getCodigo() == cod) {
			return celda3.getProducto();
		} else if (celda4.getCodigo() == cod) {
			return celda4.getProducto();
		}else {
			return null;
		}
	}
	
	public double consultarPrecio(String cod) {
		if (celda1.getCodigo() == cod) {
			return celda1.getProducto().getPrecio();
		} else if (celda2.getCodigo() == cod) {
			return celda2.getProducto().getPrecio();
		} else if (celda3.getCodigo() == cod) {
			return celda3.getProducto().getPrecio();
		} else if (celda4.getCodigo() == cod) {
			return celda4.getProducto().getPrecio();
		} 
		return 0;
	}
	
	public Celda buscarCeldaProducto(String cod) {
		if (celda1.getProducto() != null && celda1.getProducto().getCodigo()== cod) {
			return celda1;
		} else if (celda2.getProducto() != null && celda2.getProducto().getCodigo() == cod) {
			return celda2;
		} else if (celda3.getProducto() != null && celda3.getProducto().getCodigo() == cod) {
			return celda3;
		} else if (celda4.getProducto() != null && celda4.getProducto().getCodigo() == cod) {
			return celda4;
		}else {
			return null;
		}
	}
	
	public void incrementarProductos(String codigo, int stock) {
		Celda celdaEncontrada;
		celdaEncontrada = buscarCeldaProducto(codigo);
		celdaEncontrada.setStock(celdaEncontrada.getStock() + stock);
	}
	
	public void vender(String codigo) {
		Celda celdaEncontrada;
		if (celda1.getCodigo() != null && celda1.getCodigo()== codigo) {
			celdaEncontrada = celda1;
			celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
			this.saldo=this.saldo+celdaEncontrada.getProducto().getPrecio();
		} else if (celda2.getCodigo() != null && celda2.getCodigo()== codigo) {
			celdaEncontrada = celda2;
			celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
			this.saldo=this.saldo+celdaEncontrada.getProducto().getPrecio();
		} else if (celda3.getCodigo() != null && celda3.getCodigo()== codigo) {
			celdaEncontrada = celda3;
			celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
			this.saldo=this.saldo+celdaEncontrada.getProducto().getPrecio();
		} else if (celda4.getCodigo() != null && celda4.getCodigo()== codigo) {
			celdaEncontrada = celda4;
			celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
			this.saldo=this.saldo+celdaEncontrada.getProducto().getPrecio();
		}
	}
	
	public double venderConCambio(String codigo,double valorIngresado) {
		Celda celdaEncontrada;
		if (celda1.getCodigo() != null && celda1.getCodigo()== codigo) {
			celdaEncontrada = celda1;
			celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
			this.saldo=celdaEncontrada.getProducto().getPrecio();
		} else if (celda2.getCodigo() != null && celda2.getCodigo()== codigo) {
			celdaEncontrada = celda2;
			celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
			this.saldo=celdaEncontrada.getProducto().getPrecio();
		} else if (celda3.getCodigo() != null && celda3.getCodigo()== codigo) {
			celdaEncontrada = celda3;
			celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
			this.saldo=celdaEncontrada.getProducto().getPrecio();
		} else if (celda4.getCodigo() != null && celda4.getCodigo()== codigo) {
			celdaEncontrada = celda4;
			celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
			this.saldo=celdaEncontrada.getProducto().getPrecio();
		}
		return valorIngresado-this.saldo;
	}
}
