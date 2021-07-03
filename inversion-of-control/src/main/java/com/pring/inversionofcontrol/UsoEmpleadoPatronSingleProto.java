package com.pring.inversionofcontrol;

import com.pring.inversionofcontrol.empleado.SecretarioEmpleado;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleadoPatronSingleProto {

    public static void main(String[] args){

        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContent2.xml");

        SecretarioEmpleado juan =context.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
        SecretarioEmpleado mario =context.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
        SecretarioEmpleado pablo =context.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
        SecretarioEmpleado carlos =context.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
        SecretarioEmpleado manuel =context.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);

        System.out.println(juan);
        System.out.println(mario);
        System.out.println(pablo);
        System.out.println(carlos);
        System.out.println(manuel);


       /* if(juan==mario)System.out.println("son iguales los objetos de la misma clase");
            else System.out.println("la memoria apunto a bean diferentes");*/

        context.close();


    }
}
