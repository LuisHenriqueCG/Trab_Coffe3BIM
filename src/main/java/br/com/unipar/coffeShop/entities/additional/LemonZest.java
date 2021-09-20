package br.com.unipar.coffeShop.entities.additional;

import br.com.unipar.coffeShop.controller.Order;
import br.com.unipar.coffeShop.controller.OrderDecorator;

public class LemonZest extends OrderDecorator{
    
    private double VALUE = 0.50;
    
    public LemonZest(Order Order){
        super(Order);
    }
    
    @Override
    public double calculate(){
        return super.calculate() + VALUE;
    } 
}
      