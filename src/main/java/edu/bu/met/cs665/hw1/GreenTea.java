/**
 * Name: Yunrui Huang
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/23/2024
 * File Name: GreenTea.java
 * Description: This class is responsible for the Green Tea.
 */
package edu.bu.met.cs665.hw1;

public class GreenTea implements Drink {
    private static String name = "Green Tea";
    private static double price = 2.5;
    private static String type = "Tea";

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
