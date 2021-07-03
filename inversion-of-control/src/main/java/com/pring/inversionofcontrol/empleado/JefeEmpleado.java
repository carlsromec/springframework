package com.pring.inversionofcontrol.empleado;

import com.pring.inversionofcontrol.informe.CrearInforme;

public class JefeEmpleado implements Empleado {

    private CrearInforme nuevoInforme;

    public JefeEmpleado(CrearInforme nuevoInforme){
        this.nuevoInforme = nuevoInforme;
    }

    public  String getTarea(){
        return "encargode de administrar el personal y sus tareas";
    }

    @Override
    public String getInforme() {
        return "presentado el informe al director: " + nuevoInforme.getInforme();
    }
}
