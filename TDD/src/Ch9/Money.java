package Ch9;

public abstract class Money {
	protected int amount;
	protected String currency;
	
	public Money(int dollars, String currency) {
        this.amount = dollars;
        this.currency = currency;
	}
	
	abstract Money times(int multiplier);
		
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount &&
				getClass().equals(money.getClass());
	}

	public static Money dollar(int amount) {
		return new Dollar(amount, "USD");
	}

	public static Money franc(int amount) {
		return new Franc(amount, "CHF");
	}

	String currency() {
		return currency;
	}
}
