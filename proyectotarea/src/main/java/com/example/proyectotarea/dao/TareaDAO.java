package com.example.proyectotarea.dao;

import com.example.proyectotarea.entity.Tarea;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TareaDAO  extends JpaRepository<Tarea,Long>{
    
}
