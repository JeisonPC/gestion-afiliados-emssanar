package com.jfp.co.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.jfp.co.model.Afiliado;
import com.jfp.co.repository.AfiliadoRepository;

import jakarta.persistence.EntityNotFoundException;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/afiliados")
public class AfiliadoController {

    @Autowired
    AfiliadoRepository afiliadoRepository;

    @GetMapping("/home")
    public String getHomePage() {
        return "¡Bienvenido a la página de inicio!";
    }

    @GetMapping
    public ResponseEntity<List<Afiliado>> getAllAfiliados(@RequestParam(required = false) String name) {
        try {
            List<Afiliado> afiliados = new ArrayList<>();

            if (name == null)
                afiliadoRepository.findAll().forEach(afiliados::add);
            else
                afiliadoRepository.findByNameContaining(name).forEach(afiliados::add);

            if (afiliados.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(afiliados, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Afiliado> getAfiliadoById(@PathVariable("id") long id) {
        try {
            Optional<Afiliado> afiliadoData = afiliadoRepository.findById(id);

            return afiliadoData.map(afiliado -> new ResponseEntity<>(afiliado, HttpStatus.OK))
                    .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Afiliado> createAfiliado(@RequestBody Afiliado afiliado) {
        try {
            Afiliado _afiliado = afiliadoRepository.save(new Afiliado(
                    afiliado.getName(), afiliado.getEdad(), afiliado.getIdentificacion(),
                    afiliado.getGenero(), afiliado.getDireccion(), afiliado.getTelefono(), afiliado.getFechaNacimiento()
            ));
            return new ResponseEntity<>(_afiliado, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Afiliado> updateAfiliado(@PathVariable("id") long id, @RequestBody Afiliado afiliado) {
        try {
            Afiliado existingAfiliado = afiliadoRepository.findById(id).orElseThrow(EntityNotFoundException::new);

            existingAfiliado.setName(afiliado.getName());
            existingAfiliado.setEdad(afiliado.getEdad());
            existingAfiliado.setIdentificacion(afiliado.getIdentificacion());
            existingAfiliado.setGenero(afiliado.getGenero());
            existingAfiliado.setDireccion(afiliado.getDireccion());
            existingAfiliado.setTelefono(afiliado.getTelefono());
            existingAfiliado.setFechaNacimiento(afiliado.getFechaNacimiento());

            Afiliado updatedAfiliado = afiliadoRepository.save(existingAfiliado);

            return new ResponseEntity<>(updatedAfiliado, HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteAfiliado(@PathVariable("id") long id) {
        try {
            afiliadoRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping
    public ResponseEntity<HttpStatus> deleteAllAfiliados() {
        try {
            afiliadoRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
