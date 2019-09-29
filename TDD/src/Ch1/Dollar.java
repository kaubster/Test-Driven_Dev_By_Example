package Ch1;

public class Dollar {

	public int amount;

	public Dollar(int dollars) {
        this.amount = dollars;
	}

	public void times(int multiplier) {
        this.amount = this.amount * multiplier;
	}
}
