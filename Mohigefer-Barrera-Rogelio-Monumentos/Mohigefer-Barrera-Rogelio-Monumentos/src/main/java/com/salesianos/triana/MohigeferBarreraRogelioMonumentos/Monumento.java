package com.salesianos.triana.MohigeferBarreraRogelioMonumentos;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Monumento {

    @Id
    @GeneratedValue
    private Long id;

    private String code, pais, nombreCiudad, nombreMonumento, descripcion, url;
    private double latitud, longitud;

}
