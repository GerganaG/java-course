package bank;

import java.math.BigDecimal;

public class Account {

	protected BigDecimal dollars;
	
	public Account(){
		this.dollars = new BigDecimal(0);
	}
	
	public Account(BigDecimal dollars) throws NegativeMoneyException {
		setDollars(dollars);
	}
	
	public void setDollars(BigDecimal dollars) throws NegativeMoneyException {
		this.dollars = dollars;
		if(this.dollars.compareTo(new BigDecimal(0)) < 0){
			throw new NegativeMoneyException("Negativ money!!!");
		}
	}
	
	public BigDecimal getDollars() {
		return dollars;
	}

}
