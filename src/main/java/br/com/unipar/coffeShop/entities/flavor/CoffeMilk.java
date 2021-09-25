package br.com.unipar.coffeShop.entities.flavor;

import br.com.unipar.coffeShop.controller.Order;
import br.com.unipar.coffeShop.controller.OrderDecorator;

public class CoffeMilk implements Order{
    
    private double VALUE = 1.75;

    @Override
    public double calculateOrder() {
        return VALUE;
    }

}
