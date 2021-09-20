package br.com.unipar.coffeShop.entities;

import br.com.unipar.coffeShop.controller.Order;
import br.com.unipar.coffeShop.controller.OrderDecorator;

public class BigSize extends OrderDecorator{
    
    private double PERCENTAGE = 0.35;
    
    public BigSize(Order order) {
        super(order);
    }

    @Override
    public double calculate() {
        return super.calculate() * PERCENTAGE;  }
    
    
    
}