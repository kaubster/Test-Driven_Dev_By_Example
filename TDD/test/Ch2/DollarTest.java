package Ch2;

import org.junit.Test;

import Ch2.Dollar;

import static org.junit.Assert.*;

public class DollarTest {
    @Test
    public void multiplication() {         
        Dollar five= new Dollar(5);
        Dollar product = five.times(2); 
        assertEquals(10, product.amount); 
        product = five.times(3);
        assertEquals(15, product.amount);
    }
}