package com.consulti.templatespringboot.repositorio;

import com.consulti.templatespringboot.dominio.empleados;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface empleadorepositorio extends JpaRepository<empleados, Integer>{


} 
    

