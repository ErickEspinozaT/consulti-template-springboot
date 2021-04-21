package com.consulti.templatespringboot.servicio;

import java.util.List;

import com.example.practica.dominio.empleados;
import com.example.practica.repositorio.empleadorepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class empleadosservicio {

 @Autowired
  private empleadorepositorio repo;

  public List<empleados>listAll(){
      return repo.findAll();
  }
    
  public void Save(empleados std){
      repo.save(std);
  }

  public empleados get(Integer id){
      return repo.findById(id).get();
  }

  public void delete (Integer id){
      repo.deleteById(id);
  }

}
