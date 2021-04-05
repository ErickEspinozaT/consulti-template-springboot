package com.consulti.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.consulti.entity.DocumentoComercial;

public interface DocumentoComercialRepository extends MongoRepository<DocumentoComercial, Long> {
	
	List<DocumentoComercial> findById(String paramString);
}
