package com.jfp.co.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jfp.co.model.Afiliado;

public interface AfiliadoRepository extends JpaRepository<Afiliado, Long> {
    List<Afiliado> findByNameContaining(String name);
    List<Afiliado> findByEdad(int edad);
    List<Afiliado> findByIdentificacion(int identificacion);
}
