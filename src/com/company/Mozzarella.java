package com.company;

public class Mozzarella extends ToppingDecorator {
    public Mozzarella(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding mozzarella");
    }

    public String getDescription() {
        return tempPizza.getDescription() + " + Mozzarella added";
    }

    public Double getCost() {
        return tempPizza.getCost() + 7.9;
    }

}
