package com.consulti.templatespringboot.Repository;

import com.consulti.templatespringboot.Entity.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepo extends JpaRepository <Cliente,Integer> {
    
}
