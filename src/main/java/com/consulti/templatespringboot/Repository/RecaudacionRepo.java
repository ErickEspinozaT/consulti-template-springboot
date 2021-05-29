package com.consulti.templatespringboot.Repository;

import com.consulti.templatespringboot.Entity.Recaudacion;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RecaudacionRepo extends JpaRepository <Recaudacion,Integer> {
    
}
