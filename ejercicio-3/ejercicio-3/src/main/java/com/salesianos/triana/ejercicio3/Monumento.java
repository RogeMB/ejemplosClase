package com.salesianos.triana.ejercicio3;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Monumento {
    @Id
    @GeneratedValue
    private Long id;

    private String code, nombreCiudad, ciudad, nombreMonumento, descripcion, url;
    private double latitud, longitud;



}
