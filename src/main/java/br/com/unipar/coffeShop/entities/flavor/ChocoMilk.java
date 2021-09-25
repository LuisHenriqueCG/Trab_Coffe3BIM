package br.com.unipar.coffeShop.entities.flavor;

import br.com.unipar.coffeShop.controller.Order;
import br.com.unipar.coffeShop.controller.OrderDecorator;

public class ChocoMilk implements Order{
   
    private double VALUE = 2.50;

    @Override
    
    public double calculateOrder() {
        return VALUE;
    }
    
}