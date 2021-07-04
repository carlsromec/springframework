package com.everis.javaannotation.pruebaannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotation {
    public static void main(String[] args){

        ClassPathXmlApplicationContext contexto= new ClassPathXmlApplicationContext("applicationContent.xml");
        Empleado juan=contexto.getBean("comercialExperimentado",Empleado.class);
        System.out.println(juan.getTarea());
        System.out.println(juan.getInforme());
        contexto.close();
    }
}
