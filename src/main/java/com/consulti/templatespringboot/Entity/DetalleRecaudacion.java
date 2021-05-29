package com.consulti.templatespringboot.Entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class DetalleRecaudacion {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int Id; 
    private String producto;
    private Double precio;
    private Date fecha;

    @ManyToOne
        @JoinColumn(name="id_recaudacion")
        private Recaudacion recaudacion;



    public DetalleRecaudacion() {
    }

    public DetalleRecaudacion(String producto, Double precio, Date fecha, Recaudacion recaudacion) {
        this.producto = producto;
        this.precio = precio;
        this.fecha = fecha;
        this.recaudacion = recaudacion;
    }

    public int getId() {
        return this.Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getProducto() {
        return this.producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Double getPrecio() {
        return this.precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Recaudacion getRecaudacion() {
        return this.recaudacion;
    }

    public void setRecaudacion(Recaudacion recaudacion) {
        this.recaudacion = recaudacion;
    }

}
