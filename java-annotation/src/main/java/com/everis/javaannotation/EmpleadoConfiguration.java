package com.everis.javaannotation;

import com.everis.javaannotation.informe.InformeFinancieroDtoCompras;
import com.everis.javaannotation.pruebaannotation.Directorfinanciero;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.everis.javaannotation")
@PropertySource("classpath:DatosEmpresa.properties")
public class EmpleadoConfiguration {

    @Bean
    public InformeFinancieroDtoCompras informeFinancieroDtoCompras(){
        return new InformeFinancieroDtoCompras();
    }

    @Bean
    public Directorfinanciero directorfinanciero(){
        return new Directorfinanciero(informeFinancieroDtoCompras());
    }
}
