package Ch4;

public class Dollar {

	private int amount;

	public Dollar(int dollars) {
        this.amount = dollars;
	}

	public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
	}
	
	public boolean equals(Object object) {
		Dollar dollar = (Dollar) object;
		return amount == dollar.amount;
	}
}
