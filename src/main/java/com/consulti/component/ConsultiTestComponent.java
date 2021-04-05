package com.consulti.component;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.consulti.dto.RequestDocumentoComercial;
import com.consulti.dto.RequestUser;
import com.consulti.dto.ResponseUser;
import com.consulti.entity.DocumentoComercial;
import com.consulti.entity.ResponseMsg;
import com.consulti.entity.Usuario;
import com.consulti.repository.DocumentoComercialRepository;
import com.consulti.repository.UsuarioRepository;

@Component
public class ConsultiTestComponent {

	private static final Logger logger = LoggerFactory.getLogger(ConsultiTestComponent.class);
	
	@Autowired
	public ConsultiTestComponent() {
	}
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private DocumentoComercialRepository documentoComercialRepository;
	
	public ResponseUser loginUser(RequestUser query) {
		ResponseUser resp = new ResponseUser("ERROR");
		
		try {
			List<Usuario> usuarios = this.usuarioRepository.findByUsuarioAndPassword(query.getUsuario(), query.getPassword());
			if (usuarios.size() != 1)
				throw new Exception("User o Pass no valido");
			Usuario userLogin = usuarios.get(0);
					
		
			resp = new ResponseUser("OK");
			resp.setUsuario(userLogin);
		} catch (Exception e) {
			resp.setMessage("Login no valida");
			
		}
		return resp;
	}
	
	public List<DocumentoComercial> documentos() {
		List<DocumentoComercial> resp = new ArrayList<DocumentoComercial>();
		
		try {
			List<DocumentoComercial> documentos = this.documentoComercialRepository.findAll();
			resp= documentos;
		} catch (Exception e) {
			
		}
		return resp;
	}
	
	public List<DocumentoComercial> documentoById(String id) {
		List<DocumentoComercial> resp = new ArrayList<DocumentoComercial>();
		
		try {
			List<DocumentoComercial> documentos = this.documentoComercialRepository.findById(id);
			resp= documentos;
		} catch (Exception e) {
			
		}
		return resp;
	}
	
	public ResponseMsg actualizarDocumento(RequestDocumentoComercial query) {
		ResponseMsg resp = new ResponseMsg("ERROR");
		
		try {
			List<DocumentoComercial> documentos = this.documentoComercialRepository.findById(query.getId());
			if (documentos.size() != 1)
				throw new Exception("Documento no valido");
			
			DocumentoComercial updateDocument = documentos.get(0);
			updateDocument.setCliente(query.getCliente());
			updateDocument.setDetalle(query.getDetalle());
			updateDocument.setPago(query.getPago());
			Double total = (double) 0;
			for(int i= 0; i< updateDocument.getDetalle().size(); i++) {
				total = total + updateDocument.getDetalle().get(i).getTotal();
			}
			updateDocument.setSubtotal(total);
			updateDocument.setTotal(total);
			
			this.documentoComercialRepository.save(updateDocument);	
		
			resp = new ResponseMsg("OK");
		} catch (Exception e) {
			resp.setMessage("Update Documento no valida");
			
		}
		return resp;
	}
	
	public ResponseMsg crearDocumento(RequestDocumentoComercial query) {
		ResponseMsg resp = new ResponseMsg("ERROR");
		
		try {
			DocumentoComercial updateDocument = new DocumentoComercial();
			updateDocument.setCliente(query.getCliente());
			updateDocument.setDetalle(query.getDetalle());
			updateDocument.setPago(query.getPago());
			Double total = (double) 0;
			for(int i= 0; i< updateDocument.getDetalle().size(); i++) {
				total = total + updateDocument.getDetalle().get(i).getTotal();
			}
			updateDocument.setSubtotal(total);
			updateDocument.setTotal(total);
			
			this.documentoComercialRepository.save(updateDocument);	
		
			resp = new ResponseMsg("OK");
		} catch (Exception e) {
			resp.setMessage("Crear Documento no valida");
			
		}
		return resp;
	}
}
