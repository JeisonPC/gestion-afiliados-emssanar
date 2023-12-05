package com.jfp.co.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import com.jfp.co.repository.AfiliadoRepository;
import com.jfp.co.model.Afiliado;



@Service
public class AfiliadoService {
    @Autowired
    private AfiliadoRepository afiliadoRepository;

    public List<Afiliado> getAllAfiliados() {
        return afiliadoRepository.findAll();
    }

    public Optional<Afiliado> getAfiliadoById(Long id) {
        return afiliadoRepository.findById(id);
    }

    public Afiliado saveAfiliado(Afiliado afiliado) {
        return afiliadoRepository.save(afiliado);
    }

    public void deleteAfiliado(Long id) {
        afiliadoRepository.deleteById(id);
    }
}
