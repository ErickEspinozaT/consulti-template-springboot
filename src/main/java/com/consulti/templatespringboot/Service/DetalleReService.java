package com.consulti.templatespringboot.Service;

import java.util.List;

import com.consulti.templatespringboot.Entity.DetalleRecaudacion;
import com.consulti.templatespringboot.Repository.DetalleRecaudacionRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleReService {

    @Autowired
    DetalleRecaudacionRepo detalleRecaudacionRepo;


    public List<DetalleRecaudacion>listAll(){
        return detalleRecaudacionRepo.findAll();
    }
      
    public void Save(DetalleRecaudacion std){
        detalleRecaudacionRepo.save(std);
    }
  
    public DetalleRecaudacion get(Integer id){
        return detalleRecaudacionRepo.findById(id).get();
    }
  
    public void delete (Integer id){
        detalleRecaudacionRepo.deleteById(id);
    }
    
}
