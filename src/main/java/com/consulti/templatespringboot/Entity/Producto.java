package com.consulti.templatespringboot.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int Id;
    private String nombre;
    private double precio;



    public Producto() {
    }

    public Producto( String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() {
        return this.Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    


}
