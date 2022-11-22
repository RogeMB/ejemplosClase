package com.salesianos.triana.ejemplosClase;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CountryRepository
        extends JpaRepository<Country, Long> {

    Optional<Country> findFirstByCode(String code);

}