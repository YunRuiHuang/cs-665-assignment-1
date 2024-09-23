/**
 * Name: Yunrui Huang
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/23/2024
 * File Name: Espresso.java
 * Description: This class is responsible for the Espresso.
 */
package edu.bu.met.cs665.hw1;

public class Espresso implements Drink {
    private static String name = "Espresso";
    private static double price = 2.0;
    private static String type = "Coffee";

    /**
     * Getter method for drink name
     * @return the name of drink
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Getter method for drink type
     * @return the type of drink
     */
    @Override
    public String getType() {
        return type;
    }

    /**
     * Getter method for the drink price
     * @return the price of drink
     */
    @Override
    public double getPrice() {
        return price;
    }
}
