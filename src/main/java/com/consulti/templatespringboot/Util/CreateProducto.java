package com.consulti.templatespringboot.Util;

import com.consulti.templatespringboot.Entity.Producto;
import com.consulti.templatespringboot.Service.ProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



/**
 * MUY IMPORTANTE: ESTA CLASE SÓLO SE EJECUTARÁ UNA VEZ PARA CREAR LOS Productos.
 * UNA VEZ CREADOS SE DEBERÁ ELIMINAR O BIEN COMENTAR EL CÓDIGO
 *
 */

@Component
public class CreateProducto implements CommandLineRunner  {
    @Autowired
    ProductoService productoService;

    @Override
    public void run(String... args) throws Exception {
    //  Producto productoA=new Producto("ProductoA",1.50);
    //  Producto productoB=new Producto("ProductoA",2.50);
    //  Producto productoC=new Producto("ProductoA",3.50);
    //  productoService.Save(productoA);
    //  productoService.Save(productoB);
    //  productoService.Save(productoC);
    }
}
