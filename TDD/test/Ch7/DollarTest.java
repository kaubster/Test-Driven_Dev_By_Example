package Ch7;

import org.junit.Test;

import Ch7.Dollar;

import static org.junit.Assert.*;

public class DollarTest {
    @Test
    public void multiplication() {         
        Dollar five= new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }
    
    @Test
    public void equality() {
    	assertTrue((new Dollar(5).equals(new Dollar(5))));
    	assertFalse((new Dollar(5).equals(new Dollar(6))));
	}
}