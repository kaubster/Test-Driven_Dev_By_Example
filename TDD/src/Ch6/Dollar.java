package Ch6;

public class Dollar extends Money {

	public Dollar(int dollars) {
        this.amount = dollars;
	}

	public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
	}
}
