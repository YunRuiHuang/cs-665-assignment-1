/**
 * Name: Yunrui Huang
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/08/2024
 * File Name: CondimentDecorator.java
 * Description: This class is Decorator for all the condiment class.
 */
package edu.bu.met.cs665.hw1;

public abstract class CondimentDecorator implements Drink {
    protected Drink drink;
    protected String name;
    protected double price;
    /**
     * Getter method for drink name plus condiment name
     * @return the name of drink
     */
    @Override
    public String getName(){
        return drink.getName() + " " + name;
    };

    /**
     * Getter method for drink type
     * @return the type of drink
     */
    @Override
    public String getType() {
        return drink.getType();
    }

    /**
     * Getter method for the drink price plus condiment price
     * @return the price of drink
     */
    @Override
    public double getPrice() {
        return drink.getPrice() + price;
    }
}
