package com.consulti.templatespringboot.Service;

import java.util.List;

import com.consulti.templatespringboot.Entity.Cliente;
import com.consulti.templatespringboot.Repository.ClienteRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    
    @Autowired
    ClienteRepo clienteRepo;
    

    public List<Cliente>listAll(){
        return clienteRepo.findAll();
    }
      
    public void Save(Cliente std){
        clienteRepo.save(std);
    }
  
    public Cliente get(Integer id){
        return clienteRepo.findById(id).get();
    }
  
    public void delete (Integer id){
        clienteRepo.deleteById(id);
    }

    
}
