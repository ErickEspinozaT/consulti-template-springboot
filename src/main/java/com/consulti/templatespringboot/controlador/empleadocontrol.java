package com.consulti.templatespringboot.controlador;

import java.util.List;

import com.consulti.templatespringboot.dominio.empleados;
import com.consulti.templatespringboot.servicio.empleadosservicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class empleadocontrol {
    
@Autowired
private empleadosservicio service;

@GetMapping("/")
public String viewHomePage (Model modelo){
    List<empleados> listEmpleados =service.listAll();
    modelo.addAttribute("ListaEmpleados",listEmpleados);
    
    return "index";
}

@GetMapping("/new")
public String add(Model model){
    model.addAttribute("Empleados",new empleados());
    return "new";
}

@RequestMapping(value = "/save", method = RequestMethod.POST)
public String saveempleado(@ModelAttribute("Empleados") empleados std){
    service.Save(std);
    return "redirect:/";
}

@RequestMapping("/edit/{id}")
public ModelAndView showEditEmpleadoPAge(@PathVariable(name="id")int id){
    ModelAndView mav=new ModelAndView("new");
    empleados std =service.get(id);
    mav.addObject("Empleados", std);
    return mav;
}

@RequestMapping("/delete/{id}")
public String deleteempleado(@PathVariable(name="id")int id){
    service.delete(id);
    return "redirect:/";
}

}
