package br.com.unipar.coffeShop.controller;

public class OrderDecorator implements Order{

    private Order order;
    
    public OrderDecorator(Order order) {
        this.order = order;
    }

    @Override
    public double calculateOrder() {
        return order.calculateOrder();
     }
    
   
    
}