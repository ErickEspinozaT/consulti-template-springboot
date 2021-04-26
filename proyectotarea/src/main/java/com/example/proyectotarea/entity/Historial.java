package com.example.proyectotarea.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="historial")
public class Historial {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private int id_tarea;
    private String nombre_tarea;
    private String estado;
    private Date fecha;


    public Historial(int id, int id_tarea, String nombre_tarea, String estado, Date fecha) {
        this.id = id;
        this.id_tarea = id_tarea;
        this.nombre_tarea = nombre_tarea;
        this.estado = estado;
        this.fecha = fecha;
    }

    public Historial() {
    }


    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return int return the id_tarea
     */
    public int getId_tarea() {
        return id_tarea;
    }

    /**
     * @param id_tarea the id_tarea to set
     */
    public void setId_tarea(int id_tarea) {
        this.id_tarea = id_tarea;
    }

    /**
     * @return String return the nombre_tarea
     */
    public String getNombre_tarea() {
        return nombre_tarea;
    }

    /**
     * @param nombre_tarea the nombre_tarea to set
     */
    public void setNombre_tarea(String nombre_tarea) {
        this.nombre_tarea = nombre_tarea;
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

    /**
     * @return Date return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}

