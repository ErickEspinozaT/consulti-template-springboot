package com.example.proyectotarea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"com.example.proyectotarea.controller.InicioController.java"})
public class ProyectotareaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectotareaApplication.class, args);
	}

}
