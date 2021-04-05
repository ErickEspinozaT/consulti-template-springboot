package com.consulti.entity;

public class DatosPersonalesCliente {

	String tipoDNI;
	String dni;
	String nombreCliente;
	String correo;
	String direccion;
	
	public DatosPersonalesCliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTipoDNI() {
		return tipoDNI;
	}

	public void setTipoDNI(String tipoDNI) {
		this.tipoDNI = tipoDNI;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "DatosPersonales [tipoDNI=" + tipoDNI + ", dni=" + dni + ", nombreCliente=" + nombreCliente + ", correo="
				+ correo + ", direccion=" + direccion + "]";
	}

	
	
}
