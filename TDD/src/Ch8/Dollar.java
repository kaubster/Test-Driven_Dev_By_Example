package Ch8;

public class Dollar extends Money {

	public Dollar(int dollars) {
        this.amount = dollars;
	}

	public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
	}
}
