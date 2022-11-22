package com.salesianos.triana.MohigeferBarreraRogelioMonumentos;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class InitData {
    private final MonumentosRepository repo;

    @PostConstruct
    public void init() {

        Monumento giralda = new Monumento();

        giralda.setNombreMonumento("Giralda");
        giralda.setNombreCiudad("Sevilla");
        giralda.setDescripcion("Torre que preside la Catedrall de la Santa Sede de Sevilla.");
        giralda.setCode("ES");
        giralda.setLatitud(39.4654654);
        giralda.setLongitud(-5.316549684);
        giralda.setPais("España");
        giralda.setUrl("www.lagiralda.com");
        repo.save(giralda);


        Monumento bigBen = new Monumento();

        bigBen.setNombreCiudad("Londres");
        bigBen.setPais("Reino Unido");
        bigBen.setNombreMonumento("BigBen");
        bigBen.setCode("GB");
        bigBen.setDescripcion("También llamada Torre del reloj, es la torre que preside el parlamento británico.");
        bigBen.setLatitud(54.316684984);
        bigBen.setLongitud(-0.019135164);
        bigBen.setUrl("www.clocktower.uk");
        repo.save(bigBen);


        Monumento torreEiffel = new Monumento();

        torreEiffel.setNombreCiudad("París");
        torreEiffel.setPais("Francia");
        torreEiffel.setCode("FR");
        torreEiffel.setNombreMonumento("TourEiffel");
        torreEiffel.setLatitud(45.468498743);
        torreEiffel.setLongitud(2.68498854);
        torreEiffel.setUrl("www.toureiffel.fr");
        torreEiffel.setDescripcion("Torre de acero de unos 300 metros de altura visible desde todos los puntos " +
                "de la ciudad de París");
        repo.save(torreEiffel);

    }

}
