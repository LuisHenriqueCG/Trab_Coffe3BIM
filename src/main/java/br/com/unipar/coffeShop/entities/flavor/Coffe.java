package br.com.unipar.coffeShop.entities.flavor;

import br.com.unipar.coffeShop.controller.Order;
import br.com.unipar.coffeShop.controller.OrderDecorator;

public class Coffe implements Order {

    private double VALUE = 1.50;


    @Override
    public double calculate() {
        return VALUE;
    }

}