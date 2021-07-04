package com.everis.javaannotation;

import com.everis.javaannotation.informe.InformeFinancieroDtoCompras;
import com.everis.javaannotation.pruebaannotation.Directorfinanciero;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.everis.javaannotation")
public class EmpleadoConfiguration {

    public InformeFinancieroDtoCompras informeFinancieroDtoCompras(){
        return new InformeFinancieroDtoCompras();
    }

    public Directorfinanciero directorfinanciero(){
        return new Directorfinanciero();
    }
}
