package com.consulti.templatespringboot.Entity;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Recaudacion {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int Id;
    private Date fecha;
    private double valor;

    
        @ManyToOne
        @JoinColumn(name="id_cliente")
        private Cliente cliente;
    

        @OneToMany(mappedBy = "recaudacion")
       private Set<DetalleRecaudacion>detalleRecaudacions;

    public Recaudacion() {
    }

    public Set<DetalleRecaudacion> getDetalleRecaudacions() {
        return this.detalleRecaudacions;
    }

    public void setDetalleRecaudacions(Set<DetalleRecaudacion> detalleRecaudacions) {
        this.detalleRecaudacions = detalleRecaudacions;
    }


    public Recaudacion( Date fecha, double valor, Cliente cliente) {
        
        this.fecha = fecha;
        this.valor = valor;
        this.cliente = cliente;
    }

    public int getId() {
        return this.Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
