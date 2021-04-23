package com.example.proyectotarea.impl;

import com.example.proyectotarea.dao.UsuarioDAO;
import com.example.proyectotarea.entity.Usuario;
import com.example.proyectotarea.service.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private UsuarioDAO usuarioDAo;

    @Override
    public Usuario findByUsername(String username) {
       
        return usuarioDAo.findByUsername(username);
    }

    @Override
    public Usuario registrar(Usuario u) {
        u.setPassword(passwordEncoder.encode(u.getPassword()));
        return usuarioDAo.save(u);
    }

  
    
}
