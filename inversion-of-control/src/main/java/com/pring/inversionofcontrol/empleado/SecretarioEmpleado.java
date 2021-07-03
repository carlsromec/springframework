package com.pring.inversionofcontrol.empleado;

import com.pring.inversionofcontrol.empleado.Empleado;
import com.pring.inversionofcontrol.informe.CrearInforme;

public class SecretarioEmpleado implements Empleado {

    private CrearInforme nuevoInforme;
    private String email;
    private String nombreEmpresa;

    public void setNuevoInforme(CrearInforme nuevoInforme) {
        this.nuevoInforme = nuevoInforme;
    }

    @Override
    public String getTarea() {
        return "se encarga de gestionar las tareas al jefe";
    }

    @Override
    public String getInforme() {
        return "entregando el informe para la presentacion de directorio: " + nuevoInforme.getInforme();
    }

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
