package Ch9;

import org.junit.Test;

import Ch9.Money;
import Ch9.Dollar;
import Ch9.Franc;

import static org.junit.Assert.*;

public class MoneyTest {
    @Test
	public void franc_multiplication() {
    	Money five= Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }
    
    @Test
    public void multiplication() {
    	Money five= Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }
    
    @Test
    public void equality() {
    	assertTrue((Money.dollar(5).equals(Money.dollar(5))));
    	assertFalse((Money.dollar(5).equals(Money.dollar(6))));
    	assertTrue((Money.franc(5).equals( Money.franc(5))));
    	assertFalse((Money.franc(5).equals( Money.franc(6))));
    	assertFalse((Money.franc(5).equals( Money.dollar(5))));
	}
}