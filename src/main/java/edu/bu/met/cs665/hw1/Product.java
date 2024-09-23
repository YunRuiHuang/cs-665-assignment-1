/**
 * Name: Yunrui Huang
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/23/2024
 * File Name: Product.java
 * Description: This class is responsible for the product of the vending machine.
 */

package edu.bu.met.cs665.hw1;

/**
 * This is the Product class.
 * This class is responsible for product of the vending machine.
 */
public class Product {
    private int milk;
    private int sugar;
    private Drink drink;

    /**
     * Create a Product object with zero milk and zero sugar
     * @param drink the drink user select
     */
    public Product(Drink drink) {
        this.drink = drink;
        this.milk = 0;
        this.sugar = 0;
    }

    /**
     * Getter method for milk level
     * @return The level of milk
     */
    public int getMilk() {
        return milk;
    }

    /**
     * Setter method for milk level
     * @param milk The level of milk
     */
    public void setMilk(int milk) {
        if(milk >= 0 && milk <= 3){
            this.milk = milk;
        }
    }

    /**
     * Getter method for sugar level
     * @return The level of sugar
     */
    public int getSugar() {
        return sugar;
    }

    /**
     * Setter method for sugar level
     * @param sugar The level of sugar
     */
    public void setSugar(int sugar) {
        if(sugar >= 0 && sugar <= 3){
            this.sugar = sugar;
        }
    }

    /**
     * Getter method for drink name
     * @return The name of drink
     */
    public String getDrink() {
        return drink.getName();
    }

    /**
     * Setter method for drink
     * @param drink The new drink user select
     */
    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    /**
     * Getter method for product total price
     * @return The total price of product
     */
    public double getPrice() {
        double totalPrice = this.drink.getPrice() + 0.5 * this.milk + 0.5 * this.sugar;
        return totalPrice;
    }
}
