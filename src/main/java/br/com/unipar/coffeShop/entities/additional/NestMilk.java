package br.com.unipar.coffeShop.entities.additional;

import br.com.unipar.coffeShop.controller.Order;
import br.com.unipar.coffeShop.controller.OrderDecorator;

public class NestMilk extends OrderDecorator{
    
    private double VALUE = 1.40;

    public NestMilk(Order Order) {
        super(Order);
    }

    @Override
    public double calculate() {
        return super.calculate() + VALUE;
    }
}