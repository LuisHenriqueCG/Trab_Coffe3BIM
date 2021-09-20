package br.com.unipar.coffeShop.entities.flavor;

import br.com.unipar.coffeShop.controller.Order;
import br.com.unipar.coffeShop.controller.OrderDecorator;

public class EspressPanna extends OrderDecorator{
    
    private double VALUE = 4.50;

    public EspressPanna(Order Order) {
        super(Order);
    }

    @Override
    public double calculate() {
        return super.calculate() + VALUE;
    }
}