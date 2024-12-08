/**
 * Name: Yunrui Huang
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/08/2024
 * File Name: Milk.java
 * Description: This class is responsible for the Milk.
 */
package edu.bu.met.cs665.hw1;

public class Milk extends CondimentDecorator{
    /**
     * Constructor of Milk and it would setup the condiment name and price
     * @param drink
     * the drink of user choose
     * @param amount
     * the amount of Milk, if more than 3 will set as 3, if less than 0 will set as 0
     */
    public Milk(Drink drink, int amount){
        this.drink = drink;
        this.name = "Milkx" + amount;
        this.price = 0.5 * amount;
        if(amount>3){
            this.price = 0.5 * 3;
            this.name = "Milkx"+3;
        }
        if(amount<0){
            this.price = 0.5 * 0;
            this.name = "Milkx"+0;
        }
    }
}
