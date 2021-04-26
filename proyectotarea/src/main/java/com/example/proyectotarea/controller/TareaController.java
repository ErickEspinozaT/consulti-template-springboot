package com.example.proyectotarea.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.example.proyectotarea.entity.Historial;
import com.example.proyectotarea.entity.Tarea;
import com.example.proyectotarea.entity.Usuario;
import com.example.proyectotarea.service.HistorialService;
import com.example.proyectotarea.service.TareaService;
import com.example.proyectotarea.service.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TareaController {
    
    @Autowired
    private TareaService tareaService;

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private HistorialService historialService;
    
    @GetMapping("/new")
    public String add(Authentication auth,HttpSession session,Model model){
        String username = auth.getName();
        if(session.getAttribute("usuario")==null){
            Usuario usuario=usuarioService.findByUsername(username);
            usuario.setPassword(null);
            session.setAttribute("usuario", usuario);
            
        }
        model.addAttribute("Tareas",new Tarea());
        return "new";
    }
    
    @RequestMapping(value="/save", method = RequestMethod.POST)
    public String savetarea(@ModelAttribute("Tarea") Tarea std){
        tareaService.Save(std);
        return "redirect:/private/index";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditEmpleadoPAge(@PathVariable(name="id")Long id){
        ModelAndView mav=new ModelAndView("edit");
        Tarea std =tareaService.listarid(id);
        mav.addObject("Tareas", std);
        return mav;
        
    }
   
    @RequestMapping("/delete/{id}")
public String deleteempleado(@PathVariable(name="id")Long id){
    tareaService.delete(id);
    return "redirect:/private/index";
}


@GetMapping("/histo")
public String viewHomePage (Model modelo){
    List<Historial> listhistorial =historialService.listAll();
    modelo.addAttribute("ListaHistorial",listhistorial);
    
    return "historial";
}

@GetMapping("/volver")
public String volverH(){
    return "redirect:/private/index";
}

}
