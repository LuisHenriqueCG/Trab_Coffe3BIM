package br.com.unipar.coffeShop.runner;

import br.com.unipar.coffeShop.entities.flavor.*;
import br.com.unipar.coffeShop.controller.Order;
import br.com.unipar.coffeShop.entities.*;
import br.com.unipar.coffeShop.entities.additional.*;


public class Main {
    public static void main(String[] args) {
        
        Order teste = new CondensedMilk(new Cookie(new BigSize(new Coffe(new BasicOrder()))));
        
        System.out.println(teste.calculate());
        
    }
}
