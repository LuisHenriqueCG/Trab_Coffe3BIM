package br.com.unipar.coffeShop.entities.additional;

import br.com.unipar.coffeShop.controller.Order;
import br.com.unipar.coffeShop.controller.OrderDecorator;

public class CinnamonPowder extends OrderDecorator{
    
    private double VALUE = 0.75;

    public CinnamonPowder(Order Order) {
        super(Order);
    }

    @Override
    public double calculateOrder() {
        return super.calculateOrder() + VALUE;
    }
}
