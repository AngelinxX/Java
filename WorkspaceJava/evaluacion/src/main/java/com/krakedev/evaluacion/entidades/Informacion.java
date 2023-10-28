package com.krakedev.evaluacion.entidades;

import java.math.BigDecimal;
import java.util.Date;

public class Informacion {
	private String id;
	private String nombre;
	private BigDecimal precio_venta;
	private BigDecimal precio_compra;
	private String id_categoria;
		
	
	private int id_mov;
	private String id_producto;
	private int cantidad;
	private Date fecha_movimiento;

	
	
	
	public Informacion(String id_categoria) {
		super();
		this.id_categoria = id_categoria;
	}

	public Informacion() {
	}
	
	public Informacion(String id_categoria,String nombre) {
		super();
		this.nombre = nombre;
		this.id_categoria = id_categoria;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public BigDecimal getPrecio_venta() {
		return precio_venta;
	}
	public void setPrecio_venta(BigDecimal precio_venta) {
		this.precio_venta = precio_venta;
	}
	public BigDecimal getPrecio_compra() {
		return precio_compra;
	}
	public void setPrecio_compra(BigDecimal precio_compra) {
		this.precio_compra = precio_compra;
	}
	public String getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(String id_categoria) {
		this.id_categoria = id_categoria;
	}
	public int getId_mov() {
		return id_mov;
	}
	public void setId_mov(int id_mov) {
		this.id_mov = id_mov;
	}
	public String getId_producto() {
		return id_producto;
	}
	public void setId_producto(String id_producto) {
		this.id_producto = id_producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Date getFecha_movimiento() {
		return fecha_movimiento;
	}
	public void setFecha_movimiento(Date fecha_movimiento) {
		this.fecha_movimiento = fecha_movimiento;
	}
	
	@Override
	public String toString() {
		return "Informacion [nombre=" + nombre + ", id_categoria=" + id_categoria + "]";
	}
	
	
}
