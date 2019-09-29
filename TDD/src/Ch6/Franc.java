package Ch6;

public class Franc extends Money{

	public Franc(int dollars) {
        this.amount = dollars;
	}

	public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
	}
}
