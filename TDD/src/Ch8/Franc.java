package Ch8;

public class Franc extends Money{

	public Franc(int dollars) {
        this.amount = dollars;
	}

	public Money times(int multiplier) {
        return new Franc(amount * multiplier);
	}
}
