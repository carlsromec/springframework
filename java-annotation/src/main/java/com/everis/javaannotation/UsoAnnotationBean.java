package com.everis.javaannotation;

import com.everis.javaannotation.pruebaannotation.Directorfinanciero;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsoAnnotationBean {
    public static void main(String[] args){

        AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadoConfiguration.class);
        Directorfinanciero juan = contexto.getBean("directorfinanciero",Directorfinanciero.class);
        System.out.println(juan.getTarea());
        System.out.println(juan.getInforme());
        System.out.println(juan.getEmail());
        System.out.println(juan.getDatosEmpresa());
        contexto.close();
    }
}
