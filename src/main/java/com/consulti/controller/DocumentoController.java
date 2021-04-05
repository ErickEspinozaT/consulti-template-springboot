package com.consulti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.consulti.component.ConsultiTestComponent;
import com.consulti.dto.RequestDocumentoComercial;
import com.consulti.dto.RequestUser;
import com.consulti.dto.ResponseUser;
import com.consulti.entity.DocumentoComercial;
import com.consulti.entity.ResponseMsg;

@CrossOrigin
@RestController
@RequestMapping({ "/consultiAPI" })

public class DocumentoController {

	@Autowired
	private ConsultiTestComponent consultiTestComponent;
	
	
	@RequestMapping(value = { "/login" }, method = { RequestMethod.POST })
	ResponseUser loginUser(@RequestBody RequestUser query) {
		System.out.println("Input : " + query);
		return this.consultiTestComponent.loginUser(query);
	}

	@RequestMapping(value = { "/documentos" }, method = { RequestMethod.GET })
	List<DocumentoComercial> documentos() {
		return this.consultiTestComponent.documentos();
	}
	
	@RequestMapping(value = { "/documentoById" }, method = { RequestMethod.GET })
	List<DocumentoComercial> query(@RequestParam String query) {
		System.out.println("Input : " + query);
		return this.consultiTestComponent.documentoById(query);
	}
	
	@RequestMapping(value = { "/actualizarDocumento" }, method = { RequestMethod.PUT })
	ResponseMsg logactualizarDocumentonUser(@RequestBody RequestDocumentoComercial query) {
		System.out.println("Input : " + query);
		return this.consultiTestComponent.actualizarDocumento(query);
	}
	
	@RequestMapping(value = { "/crearDocumento" }, method = { RequestMethod.POST })
	ResponseMsg crearDocumento(@RequestBody RequestDocumentoComercial query) {
		System.out.println("Input : " + query);
		return this.consultiTestComponent.crearDocumento(query);
	}
	

}
