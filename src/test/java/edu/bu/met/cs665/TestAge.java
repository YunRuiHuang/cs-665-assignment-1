package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import edu.bu.met.cs665.hw1.Espresso;
import edu.bu.met.cs665.hw1.GreenTea;
import edu.bu.met.cs665.hw1.Product;
import org.junit.Test;

/**
 * Write some Unit tests for your program like the examples below.
 */

public class TestAge {

    public TestAge() {
    }

    @Test
    public void testProduct() {
        Product product = new Product(new Espresso());
        assertEquals(0,product.getMilk());
        assertEquals(0,product.getSugar());
        assertEquals(2,product.getPrice(),0);
    }

    @Test
    public void testSetMilk(){
        Product product = new Product(new Espresso());
        product.setMilk(2);
        assertEquals(2,product.getMilk());
    }

    @Test
    public void testSetSugar(){
        Product product = new Product(new Espresso());
        product.setSugar(2);
        assertEquals(2,product.getSugar());
    }

    @Test
    public void testSetDrink(){
        Product product = new Product(new Espresso());
        assertEquals("Espresso",product.getDrink());
        product.setDrink(new GreenTea());
        assertEquals("Green Tea",product.getDrink());
    }

    @Test
    public void testGetPrice(){
        Product product = new Product(new Espresso());
        product.setMilk(2);
        product.setSugar(1);
        assertEquals(3.5,product.getPrice(),0);
    }


}
