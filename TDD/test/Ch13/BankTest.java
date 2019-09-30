package Ch13;

import org.junit.Test;

import Ch13.Money;

import static org.junit.Assert.*;

public class BankTest {
    
    @Test
    public void simple_addition() {
    	Money five = Money.dollar(5);
    	Expression sum = five.plus(five);
    	Bank bank = new Bank();
    	Money reduced = bank.reduce(sum, "USD");
    	assertEquals(Money.dollar(10), reduced);
    }

    @Test
    public void plus_return_sum() {
    	Money five = Money.dollar(5);
    	Expression result = five.plus(five);
    	Sum sum = (Sum) result;
    	assertEquals(five, sum.augend);
    	assertEquals(five, sum.append);
    }

    @Test
    public void reduce_sum() {
    	Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
    	Bank bank = new Bank();
    	Money result = bank.reduce(sum, "USD");
    	assertEquals(Money.dollar(7), result);
    }

    @Test
    public void reduce_money() {
    	Bank bank = new Bank();
    	Money result = bank.reduce(Money.dollar(1), "USD");
    	assertEquals(Money.dollar(1), result);
    }
}