package com.consulti.templatespringboot.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="datos")
public class empleados {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String nombre_emp;
    private String apellido_emp;
    private int Edad_emp;
    private int telf_emp;


   public empleados(){
    super();
   }


   public empleados(int id,String nombre_emp,String
   apellido_emp, int Edad_emp, int telf_emp){
       super();
       this.id=id;
       this.nombre_emp=nombre_emp;
       this.apellido_emp=apellido_emp;
       this.Edad_emp=Edad_emp;
       this.telf_emp=telf_emp;
   }


    

    /**
     * @return int return the id_empleado
     */
    public int getId() {
        return id;
    }

    /**
     * @param id_empleado the id_empleado to set
     */
    public void setId_empleado(int id) {
        this.id = id;
    }

    /**
     * @return String return the nombre_emp
     */
    public String getNombre_emp() {
        return nombre_emp;
    }

    /**
     * @param nombre_emp the nombre_emp to set
     */
    public void setNombre_emp(String nombre_emp) {
        this.nombre_emp = nombre_emp;
    }

    /**
     * @return String return the apellido_emp
     */
    public String getApellido_emp() {
        return apellido_emp;
    }

    /**
     * @param apellido_emp the apellido_emp to set
     */
    public void setApellido_emp(String apellido_emp) {
        this.apellido_emp = apellido_emp;
    }

    /**
     * @return int return the Edad_emp
     */
    public int getEdad_emp() {
        return Edad_emp;
    }

    /**
     * @param Edad_emp the Edad_emp to set
     */
    public void setEdad_emp(int Edad_emp) {
        this.Edad_emp = Edad_emp;
    }

    /**
     * @return int return the telf_emp
     */
    public int getTelf_emp() {
        return telf_emp;
    }

    /**
     * @param telf_emp the telf_emp to set
     */
    public void setTelf_emp(int telf_emp) {
        this.telf_emp = telf_emp;
    }

}
