package com.consulti.templatespringboot.Service;

import java.util.List;

import com.consulti.templatespringboot.Entity.Producto;
import com.consulti.templatespringboot.Repository.ProductoRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {
    @Autowired
    ProductoRepo productoRepo;

    public List<Producto>listAll(){
        return productoRepo.findAll();
    }
      
    public void Save(Producto std){
        productoRepo.save(std);
    }
  
    public Producto get(Integer id){
        return productoRepo.findById(id).get();
    }
  
    public void delete (Integer id){
        productoRepo.deleteById(id);
    }
    
}
