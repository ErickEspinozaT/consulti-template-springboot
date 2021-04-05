package com.consulti.entity;

import org.springframework.data.mongodb.core.mapping.DBRef;

public class DetalleDocumento {

	@DBRef
	Producto productoID;
	String cantidad;
	Double subtotal;
	Double total;
	
	public DetalleDocumento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Producto getProductoID() {
		return productoID;
	}

	public void setProductoID(Producto productoID) {
		this.productoID = productoID;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "DetalleDocumento [productoID=" + productoID + ", cantidad=" + cantidad + ", subtotal=" + subtotal
				+ ", total=" + total + "]";
	}

	


	
	
}
