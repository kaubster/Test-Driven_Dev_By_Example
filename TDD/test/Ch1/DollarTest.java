package Ch1;

import org.junit.Test;

import Ch1.Dollar;

import static org.junit.Assert.*;

public class DollarTest {
    @Test
    public void multiplication() {         
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}