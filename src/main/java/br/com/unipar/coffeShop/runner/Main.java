package br.com.unipar.coffeShop.runner;

import br.com.unipar.coffeShop.entities.flavor.*;
import br.com.unipar.coffeShop.controller.Order;
import br.com.unipar.coffeShop.entities.*;
import br.com.unipar.coffeShop.entities.additional.*;

public class Main {
    public static void main(String[] args) {
        
      
        
        Order teste =  new CondensedMilk (new Cookie(new BigSize(new Coffe ())));
        
        Order teste2 = new NestMilk (new PowderedChocolate(new MediumSize(new CoffeMilk ())));
        
        System.out.println("O valor total e de: " + teste.calculate());
        
        System.out.println("O Valor total e de: " + teste2.calculate());
    }
}