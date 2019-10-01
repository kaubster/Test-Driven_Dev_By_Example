package Ch15;

public class Sum implements Expression {

	public Expression augend;
	public Expression append;
	
	public Sum(Expression augend, Expression addend) {
		this.augend = augend;
		this.append = addend;
	}
	
	public Money reduce(Bank bank, String to) {
		int amount = augend.reduce(bank, to).amount + append.reduce(bank, to).amount;
		return new Money(amount, to);
	}
	
	public Expression plus(Expression addend){
		return new Sum(this, addend);
	}
}
