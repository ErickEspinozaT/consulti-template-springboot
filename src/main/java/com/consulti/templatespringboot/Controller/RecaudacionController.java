package com.consulti.templatespringboot.Controller;

import java.util.List;

import com.consulti.templatespringboot.Entity.Recaudacion;
import com.consulti.templatespringboot.Service.RecaudacionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Recaudacion")
public class RecaudacionController {

    @Autowired
    RecaudacionService recaudacionService;

    @GetMapping("/listar")
    public List<Recaudacion> listar(){
        return recaudacionService.listAll();
    }
    
    @PostMapping("/save")
    public ResponseEntity<String> guardar(@RequestBody Recaudacion recaudacion){
        recaudacionService.Save(recaudacion);
        return null;
        
    }
}
