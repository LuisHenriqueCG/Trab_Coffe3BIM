package br.com.unipar.coffeShop.controller;

public class OrderDecorator implements Order{

    private Order order;
    
    //Ele vai receber o BasicOrder e salvar na propriedade a cima
    public OrderDecorator(Order order) {
        this.order = order;
    }

    @Override
    public double calculate() {
        return order.calculate();
     }
    
   
    
}