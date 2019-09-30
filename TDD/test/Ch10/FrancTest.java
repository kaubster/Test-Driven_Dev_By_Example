package Ch10;

import org.junit.Test;

import Ch10.Franc;

import static org.junit.Assert.*;

public class FrancTest {
    @Test
    public void multiplication() {         
    	Money five= Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }
    
    @Test
    public void equality() {
    	assertTrue((Money.franc(5).equals(Money.franc(5))));
    	assertFalse((Money.franc(5).equals(Money.franc(6))));
	}

    @Test
    public void different_class_equality() {
    	assertTrue(new Money(10, "CHF").equals(new Franc(10, "CHF")));
    }
}