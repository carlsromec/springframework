package com.everis.javaannotation.informe;

import org.springframework.stereotype.Component;

@Component
public class InformerFinancieroTrim3 implements  CrearInformefinanciero{

    @Override
    public String getInforme() {
        return "el informe nuestra el crecimiento de las ventas para el 3 trimestre";
    }
}
