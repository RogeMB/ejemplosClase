package com.salesianos.triana.ejercicio3;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class InitData {

    private final MonumentoRepository repo;

    @PostConstruct
    public void init() {
        Monumento giralda = new Monumento();
        giralda.setCode("ES");
        giralda.setCiudad("Sevilla");
        giralda.setNombreMonumento("Giralda");
        giralda.setDescripcion("Giralda es el nombre que recibe la torre campanario de la catedral de Santa María de la " +
                "Sede de la ciudad de Sevilla, en Andalucía.");
        giralda.setLatitud(37.386207);
        giralda.setLongitud(-5.99255572619863);
        giralda.setUrl("http://lagiralda.com");
        repo.save(giralda);

        Monumento torreEiffel = new Monumento();
        giralda.setCode("FR");
        giralda.setCiudad("París");
        giralda.setNombreMonumento("tourEiffel");
        giralda.setDescripcion("La Torre Eiffel, inicialmente llamada Tour de 300 mètres es una estructura de " +
                "hierro pudelado diseñada inicialmente por los ingenieros civiles Maurice Koechlin y Émile Nouguier");
        giralda.setLatitud(48.8583701);
        giralda.setLongitud(2.2944813);
        giralda.setUrl("http://torreEiffel.com");
        repo.save(torreEiffel);


        Monumento bigBen = new Monumento();
        giralda.setCode("GB");
        giralda.setCiudad("Londres");
        giralda.setNombreMonumento("BigBen");
        giralda.setDescripcion("Big Ben es el nombre con el que se conoce a la gran campana del reloj situado en el lado " +
                "noroeste del Palacio de Westminster, la sede del Parlamento del Reino Unido, en Londres.");
        giralda.setLatitud(51.5007292);
        giralda.setLongitud(-0.1246254);
        giralda.setUrl("http://clocktower.com");
        repo.save(bigBen);

    }

}
