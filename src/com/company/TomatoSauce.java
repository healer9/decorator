package com.company;

public class TomatoSauce extends ToppingDecorator {
    public TomatoSauce(Pizza newPizza) {
        super(newPizza);

        System.out.println("Tomato sauce added");
    }

    public String getDescription() {
        return tempPizza.getDescription() + " + tomato sauce";
    }

    public Double getCost() {
        return tempPizza.getCost() + 1.5;
    }
}
