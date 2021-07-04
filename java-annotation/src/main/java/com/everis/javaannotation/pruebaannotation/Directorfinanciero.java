package com.everis.javaannotation.pruebaannotation;

import com.everis.javaannotation.informe.CrearInformefinanciero;
import org.springframework.beans.factory.annotation.Value;

public class Directorfinanciero implements Empleado {

    public Directorfinanciero(CrearInformefinanciero informefinanciero) {
        this.informefinanciero = informefinanciero;
    }
    @Override
    public String getTarea() {
        return "realiza las tareas de informes dorector financiero";
    }

    @Override
    public String getInforme() {
        return informefinanciero.getInforme();
    }

    private CrearInformefinanciero informefinanciero;

    @Value("${email}")
    private String email;
    @Value("${datosEmpresa}")
    private String datosEmpresa;

    public String getEmail() {
        return email;
    }

    public String getDatosEmpresa() {
        return datosEmpresa;
    }
}
