package br.com.unipar.coffeShop.runner;

import br.com.unipar.coffeShop.entities.cup.*;
import br.com.unipar.coffeShop.entities.flavor.*;
import br.com.unipar.coffeShop.controller.Order;
import br.com.unipar.coffeShop.entities.additional.*;



public class Main {
    
    public static void main(String[] args) {
        
        
        Order order1 =  new CondensedMilk (new Cookie(new BigSize(new Mocha ())));
        
        Order order2 = new NestMilk (new PowderedChocolate(new MediumSize(new CoffeMilk ())));
       
        Order order3 = new CinnamonPowder (new LemonZest(new NormalSize(new EspressPanna())));
        
        Order order4 = new MediumSize(new ChocoMilk());
        
        Order order5 = new SourCreamIce(new NestMilk(new BigSize(new Coffe())));
                
        System.out.println("Bebida: Mocha \n"
                + "Adicionais: Cookie, CondensedMilk \n"
                + "Tamanho da xicara: Grande(acrescimo de 35%) \n"
                + "Valor Total: " + order1.calculateOrder());
        
        System.out.println("");
        
        System.out.println("Bebida: Cafe com Leite \n"
                + "Adicionais: Chocolate em Po, Leite Ninho \n"
                + "Tamanho da xicara: Media(acrescimo de 20%) \n"
                + "Valor Total: " + order2.calculateOrder());
        
        System.out.println("");
        
        System.out.println("Bebida: Espresso Panna \n"
                + "Adicionais: Raspas de Limao, Canela em Po \n"
                + "Tamanho da xicara: Normal(sem acrescimo) \n"
                + "Valor Total: " + order3.calculateOrder());
        
        System.out.println("");
        
        System.out.println("Bebida: Leite com Chocolate \n"
                + "Adicionais: Nenhum \n"
                + "Tamanho da xicara: Média(acrescimo de 20%) \n"
                + "Valor Total: " + order4.calculateOrder());
        
        System.out.println("");
        
        System.out.println("Bebida: Cafe Puro \n"
                + "Adicionais: Gelo de Creme de Leite, Leite Ninho \n"
                + "Tamanho da xicara: Grande(acrescimo de 35%) \n"
                + "Valor Total: " + order5.calculateOrder());
    }
}