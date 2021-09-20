package br.com.unipar.coffeShop.entities;

import br.com.unipar.coffeShop.controller.Order;
import br.com.unipar.coffeShop.controller.OrderDecorator;

public class MediumSize extends OrderDecorator {
    
    private double PERCENTAGE = 0.2;
    
    public MediumSize(Order order) {
        super(order);
    }

    @Override
    public double calculate() {
        return super.calculate() * PERCENTAGE; 
    }
    
    
}