package com.pring.inversionofcontrol;

import com.pring.inversionofcontrol.empleado.DirectorEmpleado;
import com.pring.inversionofcontrol.empleado.Empleado;
import com.pring.inversionofcontrol.empleado.SecretarioEmpleado;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleado {

    public static void main(String[] args){

        ClassPathXmlApplicationContext content = new ClassPathXmlApplicationContext("applicationContent.xml");
        Empleado juan = content.getBean("miEmpleado",Empleado.class);
        System.out.println(juan.getTarea());
        System.out.println(juan.getInforme() +"\n");

        SecretarioEmpleado maria= content.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);

        System.out.println(maria.getTarea());
        System.out.println(maria.getInforme());
        System.out.println("email: " + maria.getEmail());
        System.out.println(maria.getNombreEmpresa() +"\n");

        DirectorEmpleado manuel = content.getBean("miEmpleado",DirectorEmpleado.class);

        System.out.println(manuel.getTarea());
        System.out.println(manuel.getInforme());
        System.out.println(manuel.getEmail());
        System.out.println(manuel.getNombreEmpresa());
        content.close();
    }
}
