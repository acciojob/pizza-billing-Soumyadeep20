package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        if(isVeg) {
            price = 300+70+80;
            bill="Base Price Of The Pizza: 450";
        }
        else {
            price = 400+120+80;
            bill="Base Price Of The Pizza: 600";
        }
        // your code goes here
    }
}
