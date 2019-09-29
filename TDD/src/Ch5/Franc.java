package Ch5;

public class Franc {
	private int amount;

	public Franc(int dollars) {
        this.amount = dollars;
	}

	public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
	}
	
	public boolean equals(Object object) {
		Franc dollar = (Franc) object;
		return amount == dollar.amount;
	}
}
