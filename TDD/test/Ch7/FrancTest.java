package Ch7;

import org.junit.Test;

import Ch7.Franc;

import static org.junit.Assert.*;

public class FrancTest {
    @Test
    public void multiplication() {         
        Franc five= new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }
    
    @Test
    public void equality() {
    	assertTrue((new Franc(5).equals(new Franc(5))));
    	assertFalse((new Franc(5).equals(new Franc(6))));
	}
}