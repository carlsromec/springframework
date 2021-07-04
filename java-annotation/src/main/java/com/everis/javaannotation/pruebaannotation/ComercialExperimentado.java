package com.everis.javaannotation.pruebaannotation;

import com.everis.javaannotation.informe.CrearInformefinanciero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ComercialExperimentado implements Empleado{


    //crando el metodo initial con la anotacion @PostContrutor
    @PostConstruct
    public  void ejecutarDespues(){
        System.out.println("ejecutar antes de tod el proceso");
    }

    //crando el metodo initial con la anotacion @PreDestroy
    @PreDestroy
    public  void ejecutarAntes(){
        System.out.println("ejecutar despues de tod el proceso");
    }



    //cuatro formas de realizar la inyeccion de dependencia

    @Qualifier("informerFinancieroTrim4")
    @Autowired
    private CrearInformefinanciero nuevoInforme;


    /*@Autowired
    public ComercialExperimentado(CrearInformefinanciero nuevoInforme) {
        this.nuevoInforme = nuevoInforme;
    }*/

    /*@Autowired
    public void informeFinancieron(CrearInformefinanciero nuevoInforme){
        this.nuevoInforme=nuevoInforme;
    }*/

    /*@Autowired
    public void setNuevoInforme(CrearInformefinanciero nuevoInforme) {
        this.nuevoInforme = nuevoInforme;
    }*/

    @Override
    public String getTarea() {
        return "realiza venta en lima";
    }

    @Override
    public String getInforme() {
        return nuevoInforme.getInforme();
    }
}
