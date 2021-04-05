package com.consulti.entity;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "documento")
public class DocumentoComercial {

	@Id
	String id;
	
	DatosPago pago;
	String estadoDocumento;
	
	DatosPersonalesCliente cliente;
	ArrayList<DetalleDocumento> detalle;

	Double subtotal;
	Double total;
	
	public DocumentoComercial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public DatosPago getPago() {
		return pago;
	}

	public void setPago(DatosPago pago) {
		this.pago = pago;
	}

	public String getEstadoDocumento() {
		return estadoDocumento;
	}

	public void setEstadoDocumento(String estadoDocumento) {
		this.estadoDocumento = estadoDocumento;
	}

	public DatosPersonalesCliente getCliente() {
		return cliente;
	}

	public void setCliente(DatosPersonalesCliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<DetalleDocumento> getDetalle() {
		return detalle;
	}

	public void setDetalle(ArrayList<DetalleDocumento> detalle) {
		this.detalle = detalle;
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
		return "DocumentoComercial [id=" + id + ", pago=" + pago + ", estadoDocumento=" + estadoDocumento + ", cliente="
				+ cliente + ", detalle=" + detalle + ", subtotal=" + subtotal + ", total=" + total + "]";
	}


	
}
