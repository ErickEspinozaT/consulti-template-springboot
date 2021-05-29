package com.consulti.templatespringboot.Entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String cedula;
    private String nombre;
    private String direccion;
    private String telefono;
    
    @OneToMany(mappedBy = "cliente")
    private Set<Recaudacion>recaudacion;
    


    public Cliente() {
    }


    public Cliente(String cedula, String nombre, String direccion, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }



    public String getCedula() {
        return this.cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public Set<Recaudacion> getRecaudacion() {
        return this.recaudacion;
    }

    public void setRecaudacion(Set<Recaudacion> recaudacion) {
        this.recaudacion = recaudacion;
    }
    
}
