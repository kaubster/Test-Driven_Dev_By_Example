package Ch12;

public  class Money implements Expression {
	protected int amount;
	protected String currency;
	
	public Money(int dollars, String currency) {
        this.amount = dollars;
        this.currency = currency;
	}
	
	public Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}
		
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount &&
			currency().equals(money.currency());
	}

	public static Money dollar(int amount) {
		return new Money(amount, "USD");
	}

	public static Money franc(int amount) {
		return new Money(amount, "CHF");
	}

	String currency() {
		return currency;
	}
	
	
	public String toString() {
		return amount + " " + currency;
	}

	public Expression plus(Money append) {
		return new Money(amount + append.amount, currency);
	}
}
