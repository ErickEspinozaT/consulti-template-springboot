package com.consulti.entity;

public class DatosPago {

	String tipoPago;
	String observacion;
	Double monto;
	
	public DatosPago() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTipoPago() {
		return tipoPago;
	}

	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public DatosPago(String tipoPago, String observacion, Double monto) {
		super();
		this.tipoPago = tipoPago;
		this.observacion = observacion;
		this.monto = monto;
	}

	@Override
	public String toString() {
		return "DatosPago [tipoPago=" + tipoPago + ", observacion=" + observacion + ", monto=" + monto + "]";
	}

	

	
	
}
