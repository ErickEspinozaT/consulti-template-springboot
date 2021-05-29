package com.consulti.templatespringboot.Repository;

import com.consulti.templatespringboot.Entity.Producto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepo extends JpaRepository <Producto,Integer> {
    
}
