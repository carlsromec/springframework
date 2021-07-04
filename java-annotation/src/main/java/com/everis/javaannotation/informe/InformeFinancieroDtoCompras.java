package com.everis.javaannotation.informe;

public class InformeFinancieroDtoCompras implements CrearInformefinanciero{
    @Override
    public String getInforme() {
        return "informe entregado por el director financiero del departamento de compras";
    }
}
