package Ch14;

public class Sum implements Expression {

	public Money augend;
	public Money append;
	
	public Sum(Money augend, Money addend) {
		this.augend = augend;
		this.append = addend;
	}
	
	public Money reduce(Bank bank, String to) {
		int amount = augend.amount + append.amount;
		return new Money(amount, to);
	}
}
