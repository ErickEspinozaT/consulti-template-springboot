package com.example.proyectotarea.service;

import com.example.proyectotarea.entity.Usuario;

public interface UsuarioService {
    public Usuario findByUsername(String username);
    public Usuario registrar(Usuario u);
}
