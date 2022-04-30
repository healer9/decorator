package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Pizza pizza = new TomatoSauce(new Mozzarella(new PlainPizza()));

        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }
}
