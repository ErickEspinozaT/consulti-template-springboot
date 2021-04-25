package com.example.proyectotarea.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tareas")
public class Tarea {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String usuario;
    private Date Fecha_Fin;
    private String estado;
    

    public Tarea() {
    }

    public Tarea(long id, String nombre, String usuario, Date Fecha_Fin, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.usuario = usuario;
        this.Fecha_Fin = Fecha_Fin;
        this.estado = estado;
    }
    

    /**
     * @return long return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return String return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return String return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return Date return the Fecha_Fin
     */
    public Date getFecha_Fin() {
        return Fecha_Fin;
    }

    /**
     * @param Fecha_Fin the Fecha_Fin to set
     */
    public void setFecha_Fin(Date Fecha_Fin) {
        this.Fecha_Fin = Fecha_Fin;
    }

    /**
     * @return String return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

}
