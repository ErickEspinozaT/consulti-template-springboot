package com.consulti.entity;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "roles")
public class Rol {

	@Id
	String id;
	String nombreRol;
	ArrayList<String> rutasAcceso;
	
	public Rol() {
		super();
		rutasAcceso = new ArrayList<String>(); 
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombreRol() {
		return nombreRol;
	}

	public void setNombreRol(String nombreRol) {
		this.nombreRol = nombreRol;
	}

	public ArrayList<String> getRutasAcceso() {
		return rutasAcceso;
	}

	public void setRutasAcceso(ArrayList<String> rutasAcceso) {
		this.rutasAcceso = rutasAcceso;
	}

	@Override
	public String toString() {
		return "Rol [id=" + id + ", nombreRol=" + nombreRol + ", rutasAcceso=" + rutasAcceso + "]";
	}

	
	
	
}
