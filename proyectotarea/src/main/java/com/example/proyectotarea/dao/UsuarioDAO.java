package com.example.proyectotarea.dao;

import com.example.proyectotarea.entity.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioDAO extends JpaRepository<Usuario,Long> {
    public Usuario findByUsername(String username);
}
