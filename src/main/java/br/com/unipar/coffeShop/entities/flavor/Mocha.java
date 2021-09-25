package br.com.unipar.coffeShop.entities.flavor;

import br.com.unipar.coffeShop.controller.Order;
import br.com.unipar.coffeShop.controller.OrderDecorator;

public class Mocha implements Order{
    
    private double VALUE = 4.00;


@Override
    public double calculateOrder() {
        return VALUE;
    }

}