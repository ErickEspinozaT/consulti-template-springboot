package com.example.proyectotarea.dao;

import com.example.proyectotarea.entity.Historial;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistorialDAO extends JpaRepository<Historial,Integer > {
    
}
