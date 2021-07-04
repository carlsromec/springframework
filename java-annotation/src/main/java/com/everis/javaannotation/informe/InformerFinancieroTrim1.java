package com.everis.javaannotation.informe;

import org.springframework.stereotype.Component;

@Component
public class InformerFinancieroTrim1 implements CrearInformefinanciero{
    @Override
    public String getInforme() {
        return "realizar el informe del primer trimestre de la venta de lima";
    }
}
