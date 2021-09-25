package br.com.unipar.coffeShop.entities.cup;

import br.com.unipar.coffeShop.controller.Order;
import br.com.unipar.coffeShop.controller.OrderDecorator;

public class MediumSize extends OrderDecorator {
    
    private double PERCENTAGE = 1.2;
    
    public MediumSize(Order order) {
        super(order);
    }

    @Override
    public double calculateOrder() {
        return super.calculateOrder() * PERCENTAGE; 
    }
    
    
}