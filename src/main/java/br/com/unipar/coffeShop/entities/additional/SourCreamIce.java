package br.com.unipar.coffeShop.entities.additional;

import br.com.unipar.coffeShop.controller.Order;
import br.com.unipar.coffeShop.controller.OrderDecorator;

public class SourCreamIce extends OrderDecorator{
    
    private double VALUE = 1.75;

    public SourCreamIce(Order Order) {
        super(Order);
    }

    @Override
    public double calculate() {
        return super.calculate() + VALUE;
    }
}