package com.consulti.templatespringboot.Controller;

import com.consulti.templatespringboot.Entity.DetalleRecaudacion;
import com.consulti.templatespringboot.Service.DetalleReService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("DetalleRecaudacion")
public class DetalleReController {
    @Autowired
    DetalleReService detalleReService;

    @PostMapping("/save")
    public ResponseEntity<String> guardar(@RequestBody DetalleRecaudacion detalleRecaudacion){
        detalleReService.Save(detalleRecaudacion);
        return null;
        
    }
    
}
