package com.example.proyectotarea.service;

import java.util.List;

import com.example.proyectotarea.dao.TareaDAO;
import com.example.proyectotarea.entity.Tarea;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TareaService {

    @Autowired
    private TareaDAO repo;

    public List<Tarea>listAll(){
        return repo.findAll();
    }
      
    public void Save(Tarea std){
        repo.save(std);
    }
  
    public Tarea get(Long id){
        return repo.findById(id).get();
    }
  
    public void delete (Long id){
        repo.deleteById(id);
    }
    
    
}
