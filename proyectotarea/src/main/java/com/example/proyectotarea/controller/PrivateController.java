package com.example.proyectotarea.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.example.proyectotarea.entity.Tarea;
import com.example.proyectotarea.entity.Usuario;
import com.example.proyectotarea.service.TareaService;
import com.example.proyectotarea.service.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.security.core.Authentication;


 
@Controller
@RequestMapping("/private")
public class PrivateController {
    
    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private TareaService tareaService;

    @GetMapping("/index")
    public String index(Authentication auth,HttpSession session,Model model){
        String username = auth.getName();
        if(session.getAttribute("usuario")==null){
            Usuario usuario=usuarioService.findByUsername(username);
            usuario.setPassword(null);
            session.setAttribute("usuario", usuario);
            
        }
        List<Tarea> listatarea =tareaService.listAll();
        model.addAttribute("ListaTarea", listatarea);
        

        return "ingresoTarea";
    }


       
  




}
