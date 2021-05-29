package com.consulti.templatespringboot.Controller;

import java.util.List;

import com.consulti.templatespringboot.Entity.Cliente;
import com.consulti.templatespringboot.Service.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("Cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;
    
     //@PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/listar")
    public List<Cliente> listar(){
        return clienteService.listAll();
    }

     //@PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/save")
    public ResponseEntity<String> guardar(@RequestBody Cliente cliente){
        clienteService.Save(cliente);
        return null;
        
    }

     //@PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        clienteService.delete(id);
    }
    
     //@PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<String> actualizar(@PathVariable("id")int id,@RequestBody Cliente cliente){
    Cliente clientes =  clienteService.get(id);
    clientes.setNombre(cliente.getNombre());
    clientes.setCedula(cliente.getCedula());
    clientes.setDireccion(cliente.getDireccion());
    clientes.setTelefono(cliente.getTelefono());
    clienteService.Save(clientes);
    return null;
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/detail/{id}")
    public ResponseEntity<Cliente> getById(@PathVariable("id") int id){
    Cliente clientes =  clienteService.get(id);
    return new ResponseEntity<Cliente> (clientes, HttpStatus.OK);
}
    
    
}
