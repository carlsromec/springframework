package com.everis.javaannotation;

import com.everis.javaannotation.pruebaannotation.Empleado;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotation2 {
    public static void main(String[] args){

        //ya no se usa un archivo xml, donde se guarda los componet, lo remplazamos por la anotacion @configuration

        AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadoConfiguration.class);

        //ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContent.xml");

        Empleado juan = contexto.getBean("comercialExperimentado",Empleado.class);
        Empleado manuel = contexto.getBean("comercialExperimentado",Empleado.class);

        if(juan==manuel){
            System.out.println("se usa una mismo espacio de memoria");
            System.out.println(juan + "\n" + manuel);
        }else{
            System.out.println("el espacio de memoria que se usa son distintos");
            System.out.println(juan + "\n" + manuel);
        }

        contexto.close();

    }
}
