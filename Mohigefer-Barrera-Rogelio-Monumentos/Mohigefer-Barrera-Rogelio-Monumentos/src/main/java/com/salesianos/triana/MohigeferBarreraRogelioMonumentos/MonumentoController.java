package com.salesianos.triana.MohigeferBarreraRogelioMonumentos;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
public class MonumentoController {
    private final MonumentosRepository repo;

    @GetMapping("/monumento/")
    public ResponseEntity<List<Monumento>> findAll() {
        return ResponseEntity.ok(repo.findAll());
    }

    @GetMapping("/monumento/{id}")
    public ResponseEntity<Monumento> findById(@PathVariable Long id) {
        return ResponseEntity.of((repo.findById(id)));
    }

    @PostMapping("/monumento/")
    public ResponseEntity<Monumento> createOne(@PathVariable Long id, @RequestBody Monumento monumento) {
        return ResponseEntity.status(HttpStatus.CREATED)
                 .body(repo.save(monumento));
    }

    @PutMapping("/monumento/{id}")
    public ResponseEntity<Monumento> editById(@PathVariable Long id, @RequestBody Monumento monumento) {
            return ResponseEntity.of(
                    repo.findById(id)
                            .map(old -> {
                                old.setPais(monumento.getPais());
                                old.setCode(monumento.getCode());
                                old.setNombreMonumento(monumento.getNombreMonumento());
                                old.setDescripcion(monumento.getDescripcion());
                                old.setUrl(monumento.getUrl());
                                old.setLongitud(monumento.getLongitud());
                                old.setLatitud(monumento.getLatitud());
                                old.setNombreCiudad(monumento.getNombreCiudad());
                                return Optional.of(repo.save(old));
                            })
                            .orElse(Optional.empty())
            );
    }

    @DeleteMapping("/monumento/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id) {
        if(repo.existsById(id)) {
            repo.deleteById(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
