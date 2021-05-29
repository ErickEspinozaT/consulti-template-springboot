package com.consulti.templatespringboot.Service;

import java.util.List;

import com.consulti.templatespringboot.Entity.Recaudacion;
import com.consulti.templatespringboot.Repository.RecaudacionRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecaudacionService {

    @Autowired
    RecaudacionRepo recaudacionRepo;

    public List<Recaudacion>listAll(){
        return recaudacionRepo.findAll();
    }
      
    public void Save(Recaudacion std){
        recaudacionRepo.save(std);
    }
  
    public Recaudacion get(Integer id){
        return recaudacionRepo.findById(id).get();
    }
  
    public void delete (Integer id){
        recaudacionRepo.deleteById(id);
    }
    
}
