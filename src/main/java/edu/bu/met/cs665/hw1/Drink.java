/**
 * Name: Yunrui Huang
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/23/2024
 * File Name: Drink.java
 * Description: This class is Interface for all the drink class.
 */
package edu.bu.met.cs665.hw1;

public interface Drink {
    /**
     * Getter method for drink name
     * @return the name of drink
     */
    public String getName();

    /**
     * Getter method for drink type
     * @return the type of drink
     */
    public String getType();

    /**
     * Getter method for the drink price
     * @return the price of drink
     */
    public double getPrice();
}
