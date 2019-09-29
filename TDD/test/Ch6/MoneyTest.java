package Ch6;

import org.junit.Test;

import Ch6.Dollar;
import Ch6.Franc;

import static org.junit.Assert.*;

public class MoneyTest {
    @Test
    public void multiplication() {
        Dollar five= new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
        
        Franc ffive= new Franc(5);
        assertEquals(new Franc(10), ffive.times(2));
        assertEquals(new Franc(15), ffive.times(3));
    }
    
    @Test
    public void equality() {
    	assertTrue((new Dollar(5).equals(new Dollar(5))));
    	assertFalse((new Dollar(5).equals(new Dollar(6))));
    	assertTrue((new Franc(5).equals(new Franc(5))));
    	assertFalse((new Franc(5).equals(new Franc(6))));
	}
}