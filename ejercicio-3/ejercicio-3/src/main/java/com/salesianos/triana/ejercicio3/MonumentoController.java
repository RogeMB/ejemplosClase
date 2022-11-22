package com.salesianos.triana.ejercicio3;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MonumentoController {
    private final MonumentoRepository repo;

    @GetMapping("/monumento/")
    public ResponseEntity<List<Monumento>> findAll () {
        return ResponseEntity.ok(repo.findAll());
    }

}
