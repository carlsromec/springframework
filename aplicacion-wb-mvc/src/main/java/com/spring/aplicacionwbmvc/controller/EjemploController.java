package com.spring.aplicacionwbmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EjemploController {

    @RequestMapping
    public String listEjemplo(){
        return "ejemplovista";
    }
}
