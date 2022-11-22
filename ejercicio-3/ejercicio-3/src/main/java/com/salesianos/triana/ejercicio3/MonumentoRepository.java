package com.salesianos.triana.ejercicio3;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MonumentoRepository
    extends JpaRepository<Monumento, Long> {
    Optional<Monumento> findFirstByCode (String code);

}
