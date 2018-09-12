package com.cheeseypadhab1.padhab1pizzashopapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PizzaController {

    @RequestMapping("/pizzas")
    public String getString(){
        return "Pizzas are not good! They are great!";
    }
}