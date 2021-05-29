package com.consulti.templatespringboot.Controller;

import java.util.List;

import com.consulti.templatespringboot.Entity.Producto;
import com.consulti.templatespringboot.Service.ProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Producto")
public class ProductoController {
    @Autowired
    ProductoService productoService;

        //@PreAuthorize("hasRole('ADMIN')")
        @GetMapping("/listar")
        public List<Producto> listar(){
            return productoService.listAll();
        }
}
