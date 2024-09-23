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
        // Given: a product object with the Espresso drink
        Product product = new Product(new Espresso());

        //Then: the init milk and sugar should be zero and price of espresso should be 2
        assertEquals(0,product.getMilk());
        assertEquals(0,product.getSugar());
        assertEquals(2,product.getPrice(),0);
    }

    @Test
    public void testSetMilk(){
        // Given: a product object with the Espresso drink
        Product product = new Product(new Espresso());

        //When: the milk lever set to 2
        product.setMilk(2);

        //Then: the milk level change from 0 to 2
        assertEquals(2,product.getMilk());
    }

    @Test
    public void testSetSugar(){
        // Given: a product object with the Espresso drink
        Product product = new Product(new Espresso());

        //When: the sugar lever set to 2
        product.setSugar(2);

        //Then: the sugar level change from 0 to 2
        assertEquals(2,product.getSugar());
    }

    @Test
    public void testSetDrink(){
        // Given: a product object with the Espresso drink
        Product product = new Product(new Espresso());

        //Then: the drink name should be Espresso
        assertEquals("Espresso",product.getDrink());

        //When: change the drink to the green tea
        product.setDrink(new GreenTea());

        //Then: the drink name should be Green Tea
        assertEquals("Green Tea",product.getDrink());
    }

    @Test
    public void testGetPrice(){
        // Given: a product object with the Espresso drink
        Product product = new Product(new Espresso());

        //When: set the milk level to 2 and sugar level to 1
        product.setMilk(2);
        product.setSugar(1);

        //Then: the total price should be espresso $2 + milk 2*0.5$ + sugar 1*0.5$ = 3.5
        assertEquals(3.5,product.getPrice(),0);
    }


}
