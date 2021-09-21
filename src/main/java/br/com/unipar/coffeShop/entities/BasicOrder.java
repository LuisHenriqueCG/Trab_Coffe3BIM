package br.com.unipar.coffeShop.entities;

import br.com.unipar.coffeShop.controller.Order;

public class BasicOrder implements Order{

    
    @Override
    public double calculate() {
       
        System.out.println("Basic");
       
        return 0;
    }
}