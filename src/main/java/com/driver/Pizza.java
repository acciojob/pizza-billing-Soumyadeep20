package com.driver;

public class Pizza {

    int price;
   public Boolean isVeg;
   private Boolean ac=false;
   private Boolean at=false;
    private Boolean ap=false;
    private Boolean b=false;

    public String bill;
/*Base Price Of The Pizza: 400
Extra Cheese Added: 80
Extra Toppings Added: 120
Total Price: 600*/
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg) {
            price = 300;
            bill="Base Price Of The Pizza: 300";
        }
        else {
            price = 400;
            bill="Base Price Of The Pizza: 400";
        }
        // your code goes here
    }
    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(ac)
            return;
        ac=true;
        price +=80;
        bill +="\nExtra Cheese Added: 80";
        // your code goes here
    }

    public void addExtraToppings(){
        if(at)
            return;
        at=true;
        if(isVeg) {
            price += 70;
            bill+="\nExtra Toppings Added: 70";
        }
        else {
            price += 120;
            bill+="\nExtra Toppings Added: 120";
        }

        // your code goes here
    }

    public void addTakeaway(){
        if(ap)
            return;
        ap=true;
        price +=20;
        bill +="\nPaperbag Added: 20";
        // your code goes here
    }

    public String getBill(){
        // your code goes here
        if(b)
            return this.bill;
        b=true;
        bill+="\nTotal Price: "+price;
        return this.bill;
    }
}
