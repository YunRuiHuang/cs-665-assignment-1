package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import edu.bu.met.cs665.hw1.*;
import org.junit.Test;

/**
 * Write some Unit tests for your program like the examples below.
 */

public class TestAge {

    public TestAge() {
    }

    @Test
    public void testProduct() {
        // Given: a product object with the Espresso drink
        Drink drink = new Espresso();

        //Then: the price of espresso should be 2 and Name should only has espresso
        assertEquals("Espresso",drink.getName());
        assertEquals("Coffee",drink.getType());
        assertEquals(2,drink.getPrice(),0);
    }

    @Test
    public void testSetMilk(){
        // Given: a product object with the Espresso drink
        Drink drink = new Espresso();

        //When: the milk lever set to 2
        drink = new Milk(drink, 2);

        //Then: the milk level change from 0 to 2
        assertEquals("Espresso Milkx2",drink.getName());
        assertEquals("Coffee",drink.getType());
        assertEquals(3,drink.getPrice(),0);
    }

    @Test
    public void testSetSugar(){
        // Given: a product object with the Espresso drink
        Drink drink = new Espresso();

        //When: the sugar lever set to 2
        drink = new Sugar(drink, 2);

        //Then: the sugar level change from 0 to 2
        assertEquals("Espresso Sugarx2",drink.getName());
        assertEquals("Coffee",drink.getType());
        assertEquals(3,drink.getPrice(),0);
    }

    @Test
    public void testGetPrice(){
        // Given: a product object with the Green Tea drink
        Drink drink = new GreenTea();

        //When: set the milk level to 2 and sugar level to 1
        drink = new Milk(drink, 2);
        drink = new Sugar(drink, 1);

        //Then: the total price should be Green Tea $2.5 + milk 2*0.5$ + sugar 1*0.5$ = 4
        assertEquals("Green Tea Milkx2 Sugarx1",drink.getName());
        assertEquals("Tea",drink.getType());
        assertEquals(4,drink.getPrice(),0);
    }

    @Test
    public void testOverAmount(){
        // Given: a product object with the Green Tea drink
        Drink drink = new GreenTea();

        //When: set the milk level to 4 and sugar level to -1
        drink = new Milk(drink, 4);
        drink = new Sugar(drink, -1);

        //Then: the Milk should be limited to 3 and Sugar should be limited to 0, total price should be Green Tea $2.5 + milk 3*0.5$ + sugar 0*0.5$ = 4
        assertEquals("Green Tea Milkx3 Sugarx0",drink.getName());
        assertEquals("Tea",drink.getType());
        assertEquals(4,drink.getPrice(),0);
    }

}
