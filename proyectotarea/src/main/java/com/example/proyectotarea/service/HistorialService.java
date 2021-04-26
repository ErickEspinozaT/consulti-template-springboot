package com.example.proyectotarea.service;

import java.util.List;

import com.example.proyectotarea.dao.HistorialDAO;
import com.example.proyectotarea.entity.Historial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistorialService {
    

    @Autowired
    private HistorialDAO repo;

    public List<Historial>listAll(){
        return repo.findAll();
    }
}
