package com.everis.javaannotation.informe;

import org.springframework.stereotype.Component;

@Component
public class InformerFinancieroTrim4 implements CrearInformefinanciero{

    @Override
    public String getInforme() {
        return "informe de fin de año, con los montos totales de venta";
    }
}
