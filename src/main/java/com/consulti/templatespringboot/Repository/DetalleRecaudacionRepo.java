package com.consulti.templatespringboot.Repository;

import com.consulti.templatespringboot.Entity.DetalleRecaudacion;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalleRecaudacionRepo extends JpaRepository<DetalleRecaudacion,Integer> {
    
}
