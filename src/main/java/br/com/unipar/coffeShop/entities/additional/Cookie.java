package br.com.unipar.coffeShop.entities.additional;

import br.com.unipar.coffeShop.controller.Order;
import br.com.unipar.coffeShop.controller.OrderDecorator;

public class Cookie extends OrderDecorator{
    
    private double VALUE = 0.90;

    public Cookie(Order Order) {
        super(Order);
    }

    @Override
    public double calculate() {
        return super.calculate() + VALUE;
    }
}