package com.pring.inversionofcontrol.empleado;

import com.pring.inversionofcontrol.informe.CrearInforme;

public class DirectorEmpleado implements Empleado {

    private CrearInforme nuevoInforme;
    private String email;
    private String nombreEmpresa;

    public DirectorEmpleado(CrearInforme nuevoInforme) {
        this.nuevoInforme = nuevoInforme;
    }

    @Override
    public String getTarea() {
        return "se encarga de la administracion de la empresa";
    }

    @Override
    public String getInforme() {
        return "informe que se presentara a los socios: " + nuevoInforme.getInforme();
    }

    //getter

    public String getEmail() {
        return email;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }
    //setter

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
}
