package com.everis.javaannotation.informe;

import org.springframework.stereotype.Component;

@Component
public class InformerFinancieroTrim2 implements CrearInformefinanciero {
    @Override
    public String getInforme() {
        return "el informe muestra la catastrofe de las ventas";
    }
}
