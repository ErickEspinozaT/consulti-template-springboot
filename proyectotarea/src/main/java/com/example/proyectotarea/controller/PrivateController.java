package com.example.proyectotarea.controller;

import javax.servlet.http.HttpSession;

import com.example.proyectotarea.entity.Usuario;
import com.example.proyectotarea.service.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.security.core.Authentication;


 
@Controller
@RequestMapping("/private")
public class PrivateController {
    
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/index")
    public String index(Authentication auth,HttpSession session){
        String username = auth.getName();
        if(session.getAttribute("usuario")==null){
            Usuario usuario=usuarioService.findByUsername(username);
            usuario.setPassword(null);
            session.setAttribute("usuario", usuario);
        }
        return "index";
    }
}
