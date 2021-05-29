package com.consulti.templatespringboot.security.repository;

import com.consulti.templatespringboot.security.entity.Rol;
import com.consulti.templatespringboot.security.enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
