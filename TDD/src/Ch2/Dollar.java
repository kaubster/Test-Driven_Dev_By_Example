package Ch2;

public class Dollar {

	public int amount;

	public Dollar(int dollars) {
        this.amount = dollars;
	}

	public Dollar times(int multiplier) {
		return new Dollar(amount * multiplier);
	}
}
